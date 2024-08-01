package com.practice.crudbasic.repository;

import com.practice.crudbasic.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepo extends JpaRepository<Products,Integer> {
}
