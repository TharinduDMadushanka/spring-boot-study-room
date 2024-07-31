package com.tdm.simpleWebApp.repository;

import com.tdm.simpleWebApp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Products,Integer> {
}

/**
 * @Repository -> used to indicate that a particular class is a repository component in a Spring application
 * used to enable automatic exception translation and provides access to data persistence and retrieval mechanisms.
 */