package com.ijse.crudBasic.repository;

import com.ijse.crudBasic.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
