package com.example.pinokkio.api.category;

import com.example.pinokkio.api.category.dto.request.CategoryRequest;
import com.example.pinokkio.api.category.dto.response.CategoryResponse;
import com.example.pinokkio.api.category.dto.response.GroupCategoryResponse;
import java.util.List;
import java.util.UUID;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CategoryController {

    private final CategoryService categoryService;

    /**
     * 모든 카테고리 조회
     */
    @PreAuthorize("hasRole('ROLE_POS')")
    @GetMapping({"/pos/categories"})
    public ResponseEntity<?> getAllCategories() {
        List<Category> categoryList = this.categoryService.getGroupCategories();
        return new ResponseEntity<>(new GroupCategoryResponse(categoryList), HttpStatus.OK);
    }

    /**
     * 카테고리 생성
     */
    @PreAuthorize("hasRole('ROLE_POS')")
    @PostMapping({"/pos/categories"})
    public ResponseEntity<?> makeCategory(@RequestBody CategoryRequest categoryRequest) {
        Category category = this.categoryService.createCategory(categoryRequest.getName());
        return new ResponseEntity<>(new CategoryResponse(category), HttpStatus.CREATED);
    }

    /**
     * 카테고리 삭제
     */
    @PreAuthorize("hasRole('ROLE_POS')")
    @DeleteMapping({"pos/categories/{categoryId}"})
    public ResponseEntity<?> deleteCategory(@PathVariable UUID categoryId) {
        this.categoryService.deleteCategory(categoryId);
        return ResponseEntity.noContent().build();
    }

}