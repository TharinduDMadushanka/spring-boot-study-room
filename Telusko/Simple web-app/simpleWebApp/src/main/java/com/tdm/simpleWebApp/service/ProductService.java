package com.tdm.simpleWebApp.service;

import com.tdm.simpleWebApp.model.Products;
import com.tdm.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo; // instance of ProductRepo interface

//    List<Products> products = new ArrayList<>(Arrays.asList(
//            new Products(101, "Iphone", 50000),
//            new Products(102, "Samsung", 70000),
//            new Products(103, "Canon Camera", 100000)
//
//    ));

    public List<Products> getProducts() {
//        return products;
    }

    public Products getProductById(int prodId) {
//        return products.stream()
//                .filter(p -> p.getProdId() == prodId)
//                .findFirst().get();
    }

    public void addProducts(Products prod) {
//        products.add(prod);
    }

    public void updateProduct(Products prod) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prod.getProdId())
//                index = i;
//
//            products.set(index, prod);
//        }
    }

    public void deleteProduct(int prodId) {
//        int index = 0;
//        for (int i = 0; i < products.size(); i++) {
//            if (products.get(i).getProdId() == prodId)
//                index = i;
//
//            products.remove(index);
//        }
    }
}