package com.edu.tdm.cmjd106.repository;

import com.edu.tdm.cmjd106.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
