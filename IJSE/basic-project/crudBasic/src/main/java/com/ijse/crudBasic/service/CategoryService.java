package com.ijse.crudBasic.service;

import com.ijse.crudBasic.dto.CategoryDTO;
import com.ijse.crudBasic.entity.Category;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public interface CategoryService {

    CategoryDTO saveCategory(CategoryDTO categoryDTO);
    List<CategoryDTO> getAllCategories();
    CategoryDTO updateCategory(CategoryDTO categoryDTO);
    boolean deleteCategory(int Id);
    CategoryDTO getCategoryById(int id);

}
