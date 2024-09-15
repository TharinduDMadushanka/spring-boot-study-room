package com.edu.tdm.cmjd106.service.impl;

import com.edu.tdm.cmjd106.entity.Category;
import com.edu.tdm.cmjd106.repository.CategoryRepository;
import com.edu.tdm.cmjd106.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Override
    public List<Category> findAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category createCategory(Category category) {
        return categoryRepository.save(category);
    }
}
