from fastapi import FastAPI, HTTPException
from fastapi.responses import JSONResponse
import numpy as np
import cv2
import base64
import json
import uuid
import logging
from typing import List
from insightface.app import FaceAnalysis
from pydantic import BaseModel

# 로깅 설정
logging.basicConfig(level=logging.INFO)
logger = logging.getLogger(__name__)

app = FastAPI()

class ImageData(BaseModel):
    images: List[str]

class AnalysisResult(BaseModel):
    age: int
    gender: str
    is_face: bool
    encrypted_embedding: str

# InsightFace 얼굴 분석기 초기화
face_analyzer = FaceAnalysis(providers=['CPUExecutionProvider'])
face_analyzer.prepare(ctx_id=0, det_size=(640, 640))

def preprocess_face(frame):
    gray = cv2.cvtColor(frame, cv2.COLOR_BGR2GRAY)
    clahe = cv2.createCLAHE(clipLimit=2.0, tileGridSize=(8,8))
    equalized = clahe.apply(gray)
    blurred = cv2.GaussianBlur(equalized, (5, 5), 0)
    processed = cv2.cvtColor(blurred, cv2.COLOR_GRAY2BGR)
    return processed

def augment_image(image):
    augmentations = []
    augmentations.append(image)
    augmentations.append(cv2.rotate(image, cv2.ROTATE_90_CLOCKWISE))
    augmentations.append(cv2.rotate(image, cv2.ROTATE_90_COUNTERCLOCKWISE))
    augmentations.append(cv2.convertScaleAbs(image, alpha=1.2, beta=30))
    augmentations.append(cv2.convertScaleAbs(image, alpha=0.8, beta=-30))
    return augmentations

@app.post("/analyze_faces")
async def analyze_faces(data: ImageData):
    request_id = str(uuid.uuid4())
    logger.info(f"Received request with {len(data.images)} images")

    best_result = None
    best_score = 0
    all_ages = []
    gender_votes = {"Male": 0, "Female": 0}

    for i, base64_image in enumerate(data.images):
        try:
            image_data = base64.b64decode(base64_image)
            nparr = np.frombuffer(image_data, np.uint8)
            img = cv2.imdecode(nparr, cv2.IMREAD_COLOR)

            # 이미지 전처리
            preprocessed_img = preprocess_face(img)

            # 이미지 증강
            augmented_images = augment_image(preprocessed_img)

            for aug_img in augmented_images:
                faces = face_analyzer.get(aug_img)
                closest_face = get_closest_face(faces, threshold=0.6)

                if closest_face and closest_face.det_score > best_score:
                    age = closest_face.age
                    gender = "Male" if closest_face.gender == 1 else "Female"

                    all_ages.append(age)
                    gender_votes[gender] += 1

                    embedding = closest_face.embedding
                    encrypted_embedding = json.dumps(embedding.tolist())

                    best_score = closest_face.det_score
                    best_result = AnalysisResult(
                        age=int(np.mean(all_ages)),
                        gender=max(gender_votes, key=gender_votes.get),
                        is_face=True,
                        encrypted_embedding=encrypted_embedding
                    )
                    logger.info(f"Image {i+1} processed successfully: Age {age}, Gender {gender}, Score {best_score}")
                else:
                    logger.warning(f"Image {i+1}: No face detected or low quality face")
        except Exception as e:
            logger.error(f"Error processing image {i+1}: {str(e)}")

    if best_result is None:
        raise HTTPException(status_code=400, detail="No valid faces detected in any of the images")

    logger.info(f"Best face analysis result selected. Returning result.")
    return JSONResponse(content={"result": best_result.dict()})

@app.get("/fast/health")
async def health_check():
    return {"status": "healthy"}

def get_closest_face(faces, threshold=0.6):
    valid_faces = [face for face in faces if face.det_score >= threshold]
    if not valid_faces:
        return None
    return max(valid_faces, key=lambda face: (face.bbox[2] - face.bbox[0]) * (face.bbox[3] - face.bbox[1]))

if __name__ == "__main__":
    import uvicorn
    uvicorn.run("face_analysis_api:app", host="0.0.0.0", port=8000)
