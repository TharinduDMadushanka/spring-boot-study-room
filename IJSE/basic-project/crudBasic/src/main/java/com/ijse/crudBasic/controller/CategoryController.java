package com.ijse.crudBasic.controller;

import com.ijse.crudBasic.dto.CategoryDTO;
import com.ijse.crudBasic.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/category")
@CrossOrigin
public class CategoryController {

    @Autowired
    private CategoryService categoryService;

    @PostMapping("/saveCategory")
    public CategoryDTO saveCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.saveCategory(categoryDTO);
    }

    @GetMapping("/getCategory")
    public List<CategoryDTO> getCategory() {
        return categoryService.getAllCategories();
    }

    @PutMapping("/updateCategory")
    public CategoryDTO updateCategory(@RequestBody CategoryDTO categoryDTO) {
        return categoryService.updateCategory(categoryDTO);
    }

    @DeleteMapping("/deleteCategory/{id}")
    public boolean deleteCategory(@PathVariable int id) {
        return categoryService.deleteCategory(id);
    }

    @GetMapping("/getCategory/{id}")
    public CategoryDTO getCategoryById(@PathVariable int id) {
        return categoryService.getCategoryById(id);
    }

}
