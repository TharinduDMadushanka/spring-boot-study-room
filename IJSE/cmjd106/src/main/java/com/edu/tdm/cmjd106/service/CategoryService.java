package com.edu.tdm.cmjd106.service;

import com.edu.tdm.cmjd106.entity.Category;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CategoryService {

    List<Category> getAllCategories();
    Category createCategory(Category category);
    Category getCategoryById(Long id);

}
