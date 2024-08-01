package com.practice.crudbasic.controller;

import com.practice.crudbasic.model.Products;
import com.practice.crudbasic.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @GetMapping("/prod")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    @GetMapping("/prod/{prodId}")
    public Products getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    @PostMapping("/prod")
    public void addProduct(@RequestBody Products product){
        service.addProduct(product);
    }

    @PutMapping("/prod")
    public void updateProduct(@RequestBody Products product){
        service.updateProduct(product);
    }

    @DeleteMapping("/prod/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }
}
