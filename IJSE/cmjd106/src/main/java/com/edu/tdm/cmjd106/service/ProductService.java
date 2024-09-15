package com.edu.tdm.cmjd106.service;

import com.edu.tdm.cmjd106.entity.Product;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProductService {

    List<Product> getAllProducts();
    Product createProduct(Product product);
    Product updateProduct(Long id,Product product);

}
