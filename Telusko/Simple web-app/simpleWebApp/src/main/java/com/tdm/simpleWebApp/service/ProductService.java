package com.tdm.simpleWebApp.service;

import com.tdm.simpleWebApp.model.Products;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    List<Products> products = Arrays.asList(
            new Products(101,"Iphone",50000),
            new Products(102,"Samsung",70000),
            new Products(103,"Canon Camera",100000)

    );

    public List<Products> getProducts(){
        return products;
    }

    public Products getProductById(int prodId) {
        return products.stream()
                .filter(p -> p.getProdId() == prodId)
                .findFirst().get();
    }
}
