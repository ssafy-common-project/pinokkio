package com.example.pinokkio.api.customer.dto.request;

import com.example.pinokkio.api.customer.Customer;
import com.example.pinokkio.api.customer.dto.response.AnalysisResult;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Schema(description = "고객 등록 요청 DTO")
public class CustomerRegistrationRequest {

    @Schema(description = "얼굴 분석 정보", example = "{\"age\":24,\"gender\":\"Female\",\"encryptedEmbedding\":\"IlswLjQ5NDA3NjE5MjM3ODk5NzgsIC0yLjE2OTgxODE2MjkxODA5MSwgMC4wODk5MDY0MDkzODI4MjAxMywgMi4wOTcyNTk1MjE0ODQzNzUsIC0xLjQ1NDAzOTY5Mjg3ODcyMzEsIC0wLjg3MjcyMDk1NjgwMjM2ODIsIDAuMzkwMDg0NTA1MDgxMTc2NzYsIC0wLjAwOTc4MTAwMjk5ODM1MjA1LCAwLjM0NTgzMDQ3MDMyMzU2MjYsIC0wLjE4MzQwODkxNTk5NjU1MTUsIDAuMzI4NDE1NDUzNDMzOTkwNSwgMC45NzA5NDA5NDc1MzI2NTM4LCAtMS4yMTU2MDQxODYwNTgwNDQ0LCAwLjQ2ODg2MTcyODkwNjYzMTQ3LCAtMC4yNzc0NzE3NTA5NzQ2NTUxNSwgLTAuMjg2NTk2MDAwMTk0NTQ5NTYsIDAuODA3NzEzNjI3ODE1MjQ2NiwgMC40MDAxMDY3NTc4NzkyNTcyLCAxLjkxNzA5MzAzODU1ODk2LCAtMC4xNzA4NDQwNzgwNjM5NjQ4NCwgLTAuMTkwNjAyMjEzMTQ0MzAyMzcsIDAuNDMzMjQ2NzAxOTU1Nzk1MywgMS4wMzA0NzU4NTQ4NzM2NTcyLCAwLjAxNjk4NjA3MjA2MzQ0NjA0NSwgLTAuNTQ0MDA5NTA2NzAyNDIzMSwgLTAuNDE5ODE4MDQzNzA4ODAxMjcsIC0xLjQwOTg5NjEzNTMzMDIwMDIsIC0wLjQzNzE3MDAyODY4NjUyMzQ0LCAtMC42MDEyMzc3NzM4OTUyNjM3LCAtMS4xMzE0NDM4NTgxNDY2Njc1LCAtMC40NDk3OTc5MjgzMzMyODI0NywgMC40MDU5ODc4Mjg5Njk5NTU0NCwgMC41ODE3NzAzNjA0Njk4MTgxLCAzLjM3MTgyNjg4NzEzMDczNzMsIC0wLjMyMjQxMTQ3NzU2NTc2NTQsIDAuODQ0NDA0MDQxNzY3MTIwNCwgLTEuMTc5OTI5NzMzMjc2MzY3MiwgLTAuNDM4MjM5NjYzODM5MzQwMiwgMS4wNDg5MzYwMDk0MDcwNDM1LCAwLjYwNzUyNjMwMjMzNzY0NjUsIDAuNzUzMjA1MDAxMzU0MjE3NSwgLTEuMDM1OTMwMjc1OTE3MDUzMiwgMS4wMDk2NjQwNTg2ODUzMDI3LCAtMS4zNzkzODY0MjUwMTgzMTA1LCAtMC4zMDYxMTI5NDUwNzk4MDM0NywgMC4yMjE5ODIxMjE0Njc1OTAzMywgMC45NzU0MzMyMzA0MDAwODU0LCAtMC40NDQ2MDIzMTA2NTc1MDEyLCAtMC4wNTQ1NjUyMzU5NzI0MDQ0OCwgMi40MDE1NTc2ODM5NDQ3MDIsIC0wLjExNTExNzU5NDU5OTcyMzgyLCAtMC4xOTYwNzIzNTQ5MTI3NTc4NywgMC45MTM0NDE4OTY0Mzg1OTg2LCAxLjE4MzM2ODY4Mjg2MTMyODEsIDAuNTU1MTQzMjM3MTEzOTUyNiwgLTEuMjEyNzQ0MjM1OTkyNDMxNiwgLTAuMjQyNDExOTg1OTkzMzg1MzEsIDEuMDQ0NzcyNTA1NzYwMTkyOSwgMS4wMTU4MjU1MTAwMjUwMjQ0LCAwLjg3MTA5NDc2MzI3ODk2MTIsIC0wLjMwMTYzMTEyMjgyNzUyOTksIDEuMjExMzU0OTcwOTMyMDA2OCwgLTAuMDY1NDE2ODcyNTAxMzczMjksIC0wLjQyMjE2OTg5Mzk4MDAyNjI1LCAtMC43NDg0NjE5MDIxNDE1NzEsIC0xLjAzMzc1ODk5NzkxNzE3NTMsIDEuMDU3NTE5MDc4MjU0Njk5NywgLTAuNDc5MTI2OTMwMjM2ODE2NCwgMC44MjAxMzY3ODU1MDcyMDIxLCAwLjE1Mjg0ODYxNjI0MjQwODc1LCAxLjU3NDk2Njc4ODI5MTkzMTIsIDIuMzIzMjExOTA4MzQwNDU0LCAtMi4zMTEzNDEyODU3MDU1NjY0LCAxLjY5NzAzNjYyMzk1NDc3MywgLTAuMjAwNDQ5MDY0MzczOTcwMDMsIC0wLjEzMzg5ODk0MzY2MjY0MzQzLCAwLjE5NTEyODI3Njk0NDE2MDQ2LCAtMC42NDY0NDkyNjc4NjQyMjczLCAwLjA0NzgxMzAwNTc0NTQxMDkyLCAwLjY3NTA4MDE4MDE2ODE1MTksIC0wLjc3MDc1MTA1OTA1NTMyODQsIC0xLjAyMjU5MTM1MjQ2Mjc2ODYsIDAuNjk2MTU1NzI2OTA5NjM3NSwgLTAuMjYwMjM0ODMyNzYzNjcxOSwgMC45MTYzNTg5NDc3NTM5MDYyLCAwLjA3NDkwNDEyMTQ1ODUzMDQzLCAxLjYyNDYyMDMxODQxMjc4MDgsIDEuMTk2Nzk3NzI4NTM4NTEzMiwgMS4yNTM4MTI5MDkxMjYyODE3LCAwLjY1NzkwMTcwNDMxMTM3MDgsIDEuMzE5NTc0MzU2MDc5MTAxNiwgMC40OTg2NDg0NjQ2Nzk3MTgsIDAuODg5NTAzOTU1ODQxMDY0NSwgLTEuMTk3MDkxMjIxODA5Mzg3MiwgMC40NjU3NTE4ODYzNjc3OTc4NSwgMi4xOTcyODI1NTI3MTkxMTYsIC0xLjQxOTI2MzYwMTMwMzEwMDYsIC0wLjU3NTM0ODYxNTY0NjM2MjMsIDEuNDI0OTcwMjY5MjAzMTg2LCAtMS4xMjg0MDk3NDMzMDkwMjEsIC0xLjExNDkzMDUxMDUyMDkzNSwgMC4zNTY3NjYzMTMzMTQ0Mzc4NywgLTAuODcxOTY1NjQ2NzQzNzc0NCwgMC41MzY3MzkwNTEzNDIwMTA1LCAtMC41MDgzODI5MTY0NTA1MDA1LCAwLjk4NDc1OTIxMTU0MDIyMjIsIDEuNjM2MTY0OTAzNjQwNzQ3LCAwLjQyNTE5NzA2NDg3NjU1NjQsIC0wLjA1NjQ1MTc0NTMzMTI4NzM4NCwgMC41NTUzMDEwNzAyMTMzMTc5LCAwLjE2MjA0NTA5MTM5MDYwOTc0LCAwLjUxMzE1Mjk1Njk2MjU4NTQsIDEuMjAxNzk5MzkyNzAwMTk1MywgMC4xNDI1MDM1NDQ2ODgyMjQ4LCAwLjc3MDc5MzI1OTE0MzgyOTMsIC0xLjI0MTM3NzM1MzY2ODIxMywgLTAuMDQ3ODAzMDUxNzY5NzMzNDMsIDAuMTgxMDYxODQ4OTk4MDY5NzYsIC0wLjI4MDQ0NDIwNDgwNzI4MTUsIDAuMTg2MTk5MDU0MTIxOTcxMTMsIC0wLjE0NTA4MDIyMzY3OTU0MjU0LCAtMC43NzM4Mzk4OTA5NTY4Nzg3LCAtMC4yNzk3MDA2OTY0NjgzNTMyNywgMC42NzE2NTk0Njk2MDQ0OTIyLCAtMC40MDA5MzA4NTE2OTc5MjE3NSwgLTAuMTE0NDU4Njk1MDU0MDU0MjYsIC0xLjM2NDE4MTk5NTM5MTg0NTcsIC0xLjQ4NDQ5NzQyNzk0MDM2ODcsIC0xLjExNTc5NDE4MTgyMzczMDUsIDAuNzE3NzI2NzY3MDYzMTQwOSwgLTEuMDMwMDQyODg2NzM0MDA4OCwgMS4yODg1MzU1OTQ5NDAxODU1LCAtMS4wMDA0Njg3MzA5MjY1MTM3LCAtMC44MzIxODgwMTAyMTU3NTkzLCAxLjk2NjA4Mzc2NTAyOTkwNzIsIC0wLjQ5MTMyOTQ5MTEzODQ1ODI1LCAwLjgxMjk4NTUzOTQzNjM0MDMsIDAuMzIyMDQ2Nzg2NTQ2NzA3MTUsIC0wLjEwMzIzNTgxODQ0NTY4MjUzLCAwLjcwNjY0ODc2Njk5NDQ3NjMsIC0wLjY5OTQ4NjM3NDg1NTA0MTUsIDEuMTcwOTA2NTQzNzMxNjg5NSwgMC42MjMwMDgyNTExOTAxODU1LCAwLjQ1NTM2NDE2NzY5MDI3NzEsIDAuMjk5MTIzMTk3NzkzOTYwNTcsIC0wLjc2MDQ3OTYyOTAzOTc2NDQsIDAuNjEyMDE5NTk4NDg0MDM5MywgMS41MjYxOTgyNjc5MzY3MDY1LCAwLjI5MTU1NDk1NzYyODI1MDEsIDAuOTkzNjIzOTcxOTM5MDg2OSwgLTAuNDg0NjY2NTI2MzE3NTk2NDQsIC0wLjA1NzIyMjcxNjUxMDI5NTg3LCAtMC44MzY5MDAyOTM4MjcwNTY5LCAwLjQ3MTk0NDE1MzMwODg2ODQsIDAuMjI4NzkxOTUyMTMzMTc4NywgMS4wNTEzMjEyNjgwODE2NjUsIDEuMDYxODIxNTc5OTMzMTY2NSwgLTAuMjI2ODk0Njc2Njg1MzMzMjUsIC0wLjE0NTA4OTEzNDU3MzkzNjQ2LCAtMC43MjM1ODc1MTI5Njk5NzA3LCAwLjY0NjY4NzU2NzIzNDAzOTMsIDAuNTQ5MzQ0NTM5NjQyMzM0LCAxLjQ5MDk3MzIzNDE3NjYzNTcsIC0wLjY5MzAzMzQ1NjgwMjM2ODIsIDAuMDg3OTI5MjYzNzEwOTc1NjUsIC0xLjE5MjgxNTE4NDU5MzIwMDcsIC0wLjYxNDA0MTY4NjA1ODA0NDQsIDAuMzI2MjAwNTE1MDMxODE0NiwgMC4xNDEzODE1NjE3NTYxMzQwMywgLTAuMjMxMjg3MTk2Mjc4NTcyMDgsIC0wLjYyOTc3NjM1ODYwNDQzMTIsIC0wLjAxNDg0Njc3MTk1NTQ5MDExMiwgLTEuNDk4Mzg1Nzg3MDEwMTkyOSwgMC40ODUyNTM5ODk2OTY1MDI3LCAwLjY2MzkxNDQ0MjA2MjM3NzksIDAuMjA1NTg2MDE2MTc4MTMxMSwgLTEuOTY2OTMxMjIzODY5MzIzNywgMC4wMjUyODQ5NjA4NjU5NzQ0MjYsIDAuOTk4ODc3Mjg2OTExMDEwNywgLTAuMTAyNTE0NDQ1NzgxNzA3NzYsIC0wLjYwMDk5NzA5MDMzOTY2MDYsIDEuNDgyOTEyMDYzNTk4NjMyOCwgLTAuMjM1OTIxMTg5MTg4OTU3MjEsIC0wLjk3MTY5NjM3NjgwMDUzNzEsIC0xLjA4MjI2Nzk5OTY0OTA0NzksIC0yLjE3MDIzNzU0MTE5ODczMDUsIDEuMzU2OTUwOTk4MzA2Mjc0NCwgMC41NDI2NTIyNDkzMzYyNDI3LCAxLjcxMzUzOTgzODc5MDg5MzYsIC0wLjg0MzAzMDMzMzUxODk4MTksIC0wLjQ0OTYyNDgzNjQ0NDg1NDc0LCAwLjc0NDU1Njc4NDYyOTgyMTgsIDAuMjI1NzkzMjEyNjUyMjA2NDIsIC0wLjMxOTcwMzc1Nzc2MjkwODk0LCAwLjc2MDcwMzU2MzY5MDE4NTUsIDAuMDY5MDgzMDk0NTk2ODYyNzksIC0xLjgwMDc5NjE1MTE2MTE5MzgsIDAuNDUzMTI2MDcyODgzNjA1OTYsIC0wLjQ3MjI0NDE0MzQ4NjAyMjk1LCAwLjI2ODUwNjc5NTE2NzkyMywgMC42OTA0MDUxODk5OTA5OTczLCAwLjEyMTM2MDI0MjM2Njc5MDc3LCAtMC4zMTQ5ODc1NzAwNDczNzg1NCwgLTAuNzUwMDY0NzMwNjQ0MjI2MSwgMC4yODkyMzUyMzQyNjA1NTkxLCAxLjQxNjYyMDEzNTMwNzMxMiwgLTEuMTMzMzY2OTQyNDA1NzAwNywgLTAuNTkyMzkxOTY3NzczNDM3NSwgMC41OTE2OTkwNjM3Nzc5MjM2LCAtMS4xMTc1MTc5NDgxNTA2MzQ4LCAtMC44MTg2MTg4OTM2MjMzNTIsIDAuMjQ1OTk5MjE3MDMzMzg2MjMsIDAuMjIwOTMzNDA3NTQ1MDg5NzIsIDAuNTU5NDc4NDAyMTM3NzU2MywgMC41MDUwMjgyNDc4MzMyNTIsIDAuNjk1MDU4ODgyMjM2NDgwNywgMC4zOTU0NzEzMzQ0NTczOTc0NiwgLTAuNTc5MTc0ODE2NjA4NDI5LCAtMC40ODY0ODk3NDI5OTQzMDg0NywgMC41NTgwMzQ2NTg0MzIwMDY4LCAtMS4xODQzMDg3NjczMTg3MjU2LCAtMS4wNTgwOTczNjI1MTgzMTA1LCAwLjIxODU3NzM1NTE0NjQwODA4LCAtMC4zNDEyNjUxNDE5NjM5NTg3NCwgLTEuMDIzMTU0ODU0Nzc0NDc1LCAtMS4xMzg3MDcwNDE3NDA0MTc1LCAxLjM1MTE5Njg4NTEwODk0NzgsIDEuMjA1NjYzOTE5NDQ4ODUyNSwgLTAuOTA3ODQ3NzYyMTA3ODQ5MSwgLTAuMzk2MTU4MDM5NTY5ODU0NzQsIDAuNzg1NzExMzQ4MDU2NzkzMiwgLTAuMDc2MDAwMjczMjI3NjkxNjUsIC0wLjYyNTk1OTAzODczNDQzNiwgMC41MjQxMTQwMTI3MTgyMDA3LCAwLjc1OTIwMTk0Mzg3NDM1OTEsIC0wLjYyMDAzOTkzOTg4MDM3MTEsIDEuMzYyMDU1Nzc4NTAzNDE4LCAtMC4yNzcxNTE3MDM4MzQ1MzM3LCAtMi4xMjk1MzgwNTkyMzQ2MTksIC0wLjg3NDI4NjY1MTYxMTMyODEsIC0wLjUzODEzNDA5ODA1Mjk3ODUsIC0wLjEwMDYwMTE1MTU4NTU3ODkyLCAtMC43MDE3MjQ4ODY4OTQyMjYxLCAwLjU0MjE0Nzc1NTYyMjg2MzgsIDAuMDkwMzEyMzkxNTE5NTQ2NTEsIC0wLjM3ODEyNzA2ODI4MTE3MzcsIDAuNDY2MzcyNjk4NTQ1NDU1OTMsIC0wLjUwNzIzNTI4ODYxOTk5NTEsIDAuOTY0ODY5MDIyMzY5Mzg0OCwgMC41MzYyNzU1MDYwMTk1OTIzLCAtMC41NjE3NjAzNjU5NjI5ODIyLCAtMS4xMDQxMzI1MzMwNzM0MjUzLCAtMC4wNjAxODM3MzM3MDE3MDU5MywgMC43MTMyMTI1NDk2ODY0MzE5LCAtMC4zNTAwNzc3MTg0OTYzMjI2MywgMC42NjU2OTYzODI1MjI1ODMsIC0xLjY2OTI5NTU0OTM5MjcwMDIsIC0wLjM4NDM3MDkyMzA0MjI5NzM2LCAtMC41NzQ1NTA5MjY2ODUzMzMzLCAxLjI5NDExMTM3MTA0MDM0NDIsIC0xLjcwODI4MjU4OTkxMjQxNDYsIC0wLjI0OTM5ODIzMTUwNjM0NzY2LCAtMS43MTQ2NTA1MTE3NDE2MzgyLCAwLjU2MjY4OTc4MTE4ODk2NDgsIC0wLjAyMzYxOTUzMjU4NTE0NDA0MywgLTAuNDcwMDMwMzk3MTc2NzQyNTUsIDAuMjMyNTE0ODU4MjQ1ODQ5NiwgLTEuMjExMDIwMjMxMjQ2OTQ4MiwgMS40Mjc2ODIzOTk3NDk3NTU5LCAtMC4zODcyMDY3OTI4MzE0MjA5LCAwLjQ5MTk5NzE4MjM2OTIzMjIsIC0wLjU3MjE4NjA1Mjc5OTIyNDksIDAuODAyMzYwMTE3NDM1NDU1MywgLTEuMjA0NTU5MzI2MTcxODc1LCAxLjE2ODYzOTQyMTQ2MzAxMjcsIDAuNTYzNjY3ODkzNDA5NzI5LCAtMS43NTEzNDI2NTQyMjgyMTA0LCAwLjA3MzYxNjcyODE4NjYwNzM2LCAtMS4xMjA3MjE5MzYyMjU4OTExLCAxLjA0OTE0MzA3NTk0Mjk5MzIsIC0wLjI0MzQ1NTcwODAyNjg4NiwgMC44NTY5MzE1MDc1ODc0MzI5LCAwLjIzNTEwMTExODY4MzgxNSwgLTMuMDYzMzA3MDQ2ODkwMjU5LCAtMC44OTA0MzE4ODA5NTA5Mjc3LCAtMS4wMjA4MzEyMjczMDI1NTEzLCAwLjkyODAwMzAxMzEzNDAwMjcsIC0wLjQzMjg0MzI5NzcxOTk1NTQ0LCAwLjMzOTQzOTgzOTEyNDY3OTU3LCAtMC4xNjgwNDE3NTA3ODg2ODg2NiwgLTAuMTg4OTQ1NzI1NTYwMTg4MywgMC40MzI1MjI0MTYxMTQ4MDcxMywgMC43OTI2NDE2Mzk3MDk0NzI3LCAwLjI2MTgyNDQ1ODgzNzUwOTE2LCAtMS40Nzc2ODYyODU5NzI1OTUyLCAwLjIzNzk5ODU2MDA3MDk5MTUyLCAtMC4wODgzMjU3MDkxMDQ1Mzc5NiwgLTAuOTQzMDk1NjI0NDQ2ODY4OSwgLTAuMzMxOTk2MzgxMjgyODA2NCwgMS4zNTA0NjI2NzUwOTQ2MDQ1LCAwLjA5OTU3NTIyMTUzODU0MzcsIDEuMzY4MTE0NzA5ODU0MTI2LCAtMC40ODg1MDQ3MDc4MTMyNjI5NCwgLTAuNTQ5NTUwMjk0ODc2MDk4NiwgMC4wOTczMDYwODAxNjI1MjUxOCwgMC4wOTUzNzc3MjgzNDMwMDk5NSwgMC43MTI3ODA1OTQ4MjU3NDQ2LCAtMS43MzA0Mjg5MzQwOTcyOSwgMC42MDc5MjI0MzQ4MDY4MjM3LCAtMS4xMDI3OTIxNDM4MjE3MTYzLCAtMC44NDIxNTQzMjQwNTQ3MTgsIDAuNTY3NzgwOTExOTIyNDU0OCwgLTEuNjE3MzU0MzkzMDA1MzcxLCAwLjQyODQyODIzMjY2OTgzMDMsIDAuMzI0Nzc4OTQ0MjUzOTIxNSwgLTAuNDg5MjQ0NTgwMjY4ODU5ODYsIC0wLjMxNzQwNjU2NDk1MDk0MywgMS40NDM1MTkxMTU0NDc5OTgsIC0wLjg5ODUxMTc2NzM4NzM5MDEsIDAuNTg4MTI4Njg1OTUxMjMyOSwgLTAuNzAwNjgzODMyMTY4NTc5MSwgLTAuOTAxOTQxODk1NDg0OTI0MywgLTAuOTEzOTc0MTY1OTE2NDQyOSwgLTAuMzUwNzM1MTg3NTMwNTE3NiwgLTEuMjkzMDE1MTIyNDEzNjM1MywgLTAuMjcxNTI3NjE4MTY5Nzg0NTUsIC0wLjAzMTcyMDc3OTgzNjE3NzgyNiwgMC44NDIxODE2MjI5ODIwMjUxLCAxLjE0MTE2Nzk5ODMxMzkwMzgsIC0xLjYxNzkwNDY2MzA4NTkzNzUsIDAuNjQ3NTgwNTA0NDE3NDE5NCwgLTEuMDMxMDU5Mzg0MzQ2MDA4MywgMS4yODQwNzc3NjM1NTc0MzQsIC0wLjIxNDE2MjM0OTcwMDkyNzczLCAwLjI0MjM4NTkyMzg2MjQ1NzI4LCAtMS44Mjc5Mjk5NzM2MDIyOTUsIC0xLjQ3MjYzNjIyMjgzOTM1NTUsIC0wLjI2MzA5OTY3MDQxMDE1NjI1LCAtMi4xMDQ2MzM4MDgxMzU5ODYzLCAtMC4wNzExNzkxMTQyODIxMzEyLCAwLjA2NjY1MTk5OTk1MDQwODk0LCAyLjQ3NzkxODM4NjQ1OTM1MDYsIC0wLjg4MzQ0OTE5NjgxNTQ5MDcsIC0xLjMxNjYwMjExMDg2MjczMiwgMC4yNzQxMTEzNjAzMTE1MDgyLCAxLjc1MjI2MTQwMDIyMjc3ODMsIDAuMTQzNTUzMTgyNDgyNzE5NDIsIC0wLjk4NTIwMjE5MzI2MDE5MjksIDAuMDM5NzA1ODU3NjM0NTQ0MzcsIDEuMzI2MDk1ODE5NDczMjY2NiwgMC4xMzA5NDQzNDE0MjExMjczMiwgLTAuOTc5NDM4NzgxNzM4MjgxMiwgMC40ODEzNDIxOTY0NjQ1Mzg2LCAtMC4xMDk0Mjk3MDk2MTMzMjMyMSwgLTAuNDkyNjkwNzEyMjEzNTE2MjQsIDAuMjM2MjI5Njg3OTI5MTUzNDQsIC0wLjgwMjQwODA5OTE3NDQ5OTUsIDAuNjI4NjQyMzgwMjM3NTc5MywgMC40ODA5MzY0MDgwNDI5MDc3LCAxLjY1OTg1NDg4ODkxNjAxNTYsIDAuODAyMzEyOTcwMTYxNDM4LCAwLjQyMzk1MTUwNjYxNDY4NTA2LCAtMC45MzA5MDY1MzQxOTQ5NDYzLCAxLjAwOTQyOTkzMTY0MDYyNSwgLTAuMTExNjYzNTEyODg1NTcwNTMsIC0wLjI3NTg5MTgxMDY1NTU5Mzg3LCAwLjg5MDM5NjY1NDYwNTg2NTUsIC0xLjA5OTQzNzcxMzYyMzA0NjksIC0wLjQ1OTA4OTM5ODM4NDA5NDI0LCAtMC43NDUxMjE3MTc0NTMwMDI5LCAtMS41MjEzMjU3MDc0MzU2MDgsIC0wLjQ2OTUxNjc1NDE1MDM5MDYsIC0wLjQ5MzE5ODIxNTk2MTQ1NjMsIC0xLjIwNzM0NDI5MzU5NDM2MDQsIC0wLjMwMjIyNzE5OTA3NzYwNjIsIC0wLjgyNzI0MTMwMTUzNjU2MDEsIC0wLjYwMzUzMjkxMDM0Njk4NDksIDAuNzY2ODk2NzI0NzAwOTI3NywgLTAuNDE3Nzk3OTUyODkwMzk2MSwgMS4zMzc4OTMxMjgzOTUwODA2LCAtMC40NTMxNDk0Mzc5MDQzNTc5LCAwLjEzMDM4OTgwOTYwODQ1OTQ3LCAwLjI5MjYyNDgwMTM5NzMyMzYsIC0wLjAzNDA5ODk5NzcxMjEzNTMxNSwgMS40NjI2MDQxNjUwNzcyMDk1LCAwLjYwNjY0MzI1OTUyNTI5OTEsIC0xLjA3NDEyODUwODU2NzgxLCAtMC4yMjgxNjczODQ4NjI4OTk3OCwgLTAuMTAxODIwOTkwNDQzMjI5NjgsIDAuNDg0MTUwNzY3MzI2MzU1LCAtMS4wOTE2NDI4NTY1OTc5MDA0LCAxLjA2NjM4MzQ4MTAyNTY5NTgsIC0wLjAzNDc5MzkzOTQ0MTQ0MjQ5LCAwLjM3MTU2Mjk1Nzc2MzY3MTksIDAuMTI5MDE3MTQ0NDQxNjA0NjEsIC0yLjE4MTg0MTg1MDI4MDc2MTcsIC0wLjkzNDIxMjc0NDIzNTk5MjQsIC0wLjI4MjAyNDM4MzU0NDkyMTksIDAuMjYyNDQzNDgyODc1ODI0LCAtMS4wMDExMjg1NTQzNDQxNzcyLCAtMS4xNDk4ODE2MDEzMzM2MTgyLCAxLjcxNDM0OTAzMTQ0ODM2NDMsIC0wLjMyMDA5Mzg3MDE2Mjk2Mzg3LCAtMS4wNjE0Mjg0Mjc2OTYyMjgsIC0wLjE4MjgwNTg5NTgwNTM1ODksIC0xLjEwOTI5NjU2MDI4NzQ3NTYsIDAuMTA3NDk1ODgxNjE3MDY5MjQsIDAuMTQ2ODEzODY5NDc2MzE4MzYsIC0xLjEzNjQ4MzMxMTY1MzEzNzIsIDAuMTMzMDgwNDgyNDgyOTEwMTYsIC0wLjMzODgzMjMxODc4MjgwNjQsIDAuMDEyMjE0OTI4ODY1NDMyNzQsIC0wLjA4NDI4MTc3MjM3NTEwNjgxLCAwLjg1NjQyNjIzOTAxMzY3MTksIC0wLjMwNzIyMzExMTM5MTA2NzUsIC0wLjQ0OTcwNjc2MzAyOTA5ODUsIDEuMjA1ODk2MDE5OTM1NjA4LCAxLjE4NTI1NDQ1NDYxMjczMiwgLTAuNzY3OTk4Mzk3MzUwMzExMywgMS4wOTI0Njc3ODQ4ODE1OTE4LCAtMS4wNTQyMzYxNzM2Mjk3NjA3LCAwLjE4MDA2MTM4NTAzNTUxNDgzLCAwLjg0MjM4MDA0Njg0NDQ4MjQsIDAuNjE2MDgxODkzNDQ0MDYxMywgLTAuMjg3NTUzNTQ4ODEyODY2MiwgMi4wNDY1MDk5ODExNTUzOTU1LCAxLjEyMDExNjQ3MjI0NDI2MjcsIDAuNDMzOTExMDI1NTI0MTM5NCwgLTAuMjcxMzMxMDEyMjQ4OTkyOSwgLTAuMzUyNjU0OTkzNTM0MDg4MTMsIC0wLjI0NDU4MjQxNDYyNzA3NTIsIC0wLjcwNTg5NzkyNzI4NDI0MDcsIDAuMjcxMjM0MDA1Njg5NjIwOTcsIC0xLjM1OTE3ODQyMzg4MTUzMDgsIDAuMzIzMDYyODk2NzI4NTE1NiwgMi4xMDkzMjE1OTQyMzgyODEyLCAwLjI5NjY3MzMyNzY4NDQwMjQ3LCAtMC4zOTkzMjcyNzgxMzcyMDcwMywgLTAuNzQ1NjYxNzM1NTM0NjY4LCAxLjk5MjU1MjM5OTYzNTMxNSwgMC4yNTEzODIzNTA5MjE2MzA4NiwgMS4xNTE0Njc0NDI1MTI1MTIyLCAtMS41NjUyMjMzMzYyMTk3ODc2LCAxLjc3OTM5MTE2OTU0ODAzNDcsIDAuMDMzODk2MzQxOTE5ODk4OTksIC0wLjE4MjU4MTMzNTMwNjE2NzYsIDAuMTQ3NDI2MDgzNjgzOTY3NiwgLTAuNDU1NDkyMDE5NjUzMzIwMywgLTAuMjU3ODQ2NDQ0ODQ1MTk5NiwgMS42MzA1OTczNTI5ODE1Njc0LCAtMC41NTY0NjAyNjEzNDQ5MDk3LCAtMC43MTI0NTM5NjEzNzIzNzU1LCAwLjU3MDY5NjIzNDcwMzA2NCwgMC4wNjIxNTcyOTU2NDQyODMyOTUsIDEuMTAyMDY4NDI0MjI0ODUzNSwgLTEuMTUzMDYxODY2NzYwMjU0LCAwLjczOTE3Nzk0MjI3NjAwMSwgLTAuOTY2ODUzMjAxMzg5MzEyNywgLTEuMTk0MjM2NTE2OTUyNTE0NiwgMC4zNjQ1NDQzMDIyMjUxMTI5LCAyLjA3ODMxODgzNDMwNDgwOTYsIC0wLjY3ODE2NTMxNjU4MTcyNjEsIDEuMTM0MjgxNzU0NDkzNzEzNCwgLTAuOTkwNjUxMDcxMDcxNjI0OCwgLTAuMTczOTk1NDc5OTQxMzY4MSwgMC4xNjcwODk0MTc1NzY3ODk4NiwgLTAuMzYyNTc3MzE5MTQ1MjAyNjQsIDAuODI1ODEzMDU1MDM4NDUyMSwgMC4yNzE3MjY0ODkwNjcwNzc2NCwgLTAuNTgwMjY5MjE3NDkxMTQ5OSwgLTEuNjE3MjAyOTk3MjA3NjQxNiwgMS4zNjg2MTgyNDk4OTMxODg1LCAxLjc2NDQ0MDE3ODg3MTE1NDgsIDAuMTk5MDg5MjU4OTA5MjI1NDYsIDAuNzYzNDUwNjIyNTU4NTkzOCwgMC4zMzcwNDMxMzYzNTgyNjExLCAtMC4yMDY4OTA3MzIwNDk5NDIwMiwgMC4xNTc3NDUwNDg0MDM3Mzk5MywgLTAuNTk3MTc4MzM5OTU4MTkwOSwgMi4wMjEwMDU2MzA0OTMxNjQsIC0wLjY2NzY5NDgwNzA1MjYxMjMsIDEuMTAwMzQ0MDYxODUxNTAxNSwgMS4yNDIwMDQwMzY5MDMzODEzLCAtMC45Mzc3MTE4MzQ5MDc1MzE3LCAxLjgwOTM4OTIzMzU4OTE3MjQsIDAuMDk2NTY4NDIwNTI5MzY1NTQsIC0wLjQ1ODUzNzU3ODU4Mjc2MzY3LCAtMC4xNTQ2Mjk5OTA0NTg0ODg0NiwgMC40MDQ0ODYzMjgzNjM0MTg2LCAwLjc5ODU0NzUwNjMzMjM5NzUsIC0wLjUyMDgxNDg5NTYyOTg4MjgsIDEuNDk3NDY5OTAyMDM4NTc0MiwgLTAuMjEyMjE1OTg5ODI4MTA5NzQsIC0wLjE2NzU4MDM1MTIzMzQ4MjM2LCAtMS4zNTU5MTc0NTM3NjU4NjkxLCAwLjUxMjEzNDc5MDQyMDUzMjIsIC0xLjMwNDczMTI0OTgwOTI2NTEsIC0wLjI3ODUzNjI2MDEyODAyMTI0LCAwLjI4NjI5NTg5MDgwODEwNTQ3LCAxLjIzODY2OTM5NTQ0Njc3NzMsIC0wLjkwMTkyNDA3MzY5NjEzNjUsIC0xLjczNDI0OTIzNDE5OTUyNCwgLTAuMzQ2NjQ0MTkyOTM0MDM2MjUsIDAuODY1Njg5MTU4NDM5NjM2MiwgMC4yODc1NjI0ODk1MDk1ODI1LCAtMC4zMDA5NTg1NzM4MTgyMDY4LCAxLjUxMTEyMzI5OTU5ODY5MzgsIDIuNjExNDg0MDUwNzUwNzMyNCwgMC40NTEyMzU5MjAxOTA4MTExNiwgLTAuNDMyMTIwNTAxOTk1MDg2NjcsIC0wLjgyNjQyNDk1NjMyMTcxNjMsIDAuMTgwNTkxNTY4MzUwNzkxOTNdIg==\",\"face\":true}",
            required = true)
    private AnalysisResult analysisResult;

    @Schema(description = "전화번호 8자리", example = "12345678", required = true)
    private String phoneNumber;

}
