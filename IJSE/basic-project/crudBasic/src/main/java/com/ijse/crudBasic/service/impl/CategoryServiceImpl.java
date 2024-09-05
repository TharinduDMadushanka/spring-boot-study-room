package com.ijse.crudBasic.service.impl;

import com.ijse.crudBasic.dto.CategoryDTO;
import com.ijse.crudBasic.entity.Category;
import com.ijse.crudBasic.repository.CategoryRepo;
import com.ijse.crudBasic.service.CategoryService;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryRepo categoryRepo;

    @Autowired
    private ModelMapper modelMapper;


    @Override
    public CategoryDTO saveCategory(CategoryDTO categoryDTO) {
        categoryRepo.save(modelMapper.map(categoryDTO, Category.class));

        return categoryDTO;
    }

    @Override
    public List<CategoryDTO> getAllCategories() {
        List<Category> categoryList = categoryRepo.findAll();
        return modelMapper.map(categoryList, new TypeToken<List<CategoryDTO>>() {}.getType());
    }

    @Override
    public CategoryDTO updateCategory(CategoryDTO categoryDTO) {
        categoryRepo.save(modelMapper.map(categoryDTO, Category.class));

        return categoryDTO;
    }

    @Override
    public boolean deleteCategory(int Id) {
        categoryRepo.deleteById(Id);
        return true;
    }

    @Override
    public CategoryDTO getCategoryById(int id) {

        if (categoryRepo.existsById(id)) {
            Category category = categoryRepo.findById(id).orElse(null);
            return modelMapper.map(category, CategoryDTO.class);
        }else {
            return null;
        }

    }
}
