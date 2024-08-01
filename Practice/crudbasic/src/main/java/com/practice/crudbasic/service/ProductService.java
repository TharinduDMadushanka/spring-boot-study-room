package com.practice.crudbasic.service;

import com.practice.crudbasic.model.Products;
import com.practice.crudbasic.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

    public List<Products> getProducts(){
        return repo.findAll();
    }

    public Products getProductById(int id){
        return repo.findById(id).orElse(null);
    }

    public void addProduct(Products prod){
        repo.save(prod);
    }

    public void updateProduct(Products prod){
        repo.save(prod);
    }

    public void deleteProduct(int id){
        repo.deleteById(id);
    }

}
