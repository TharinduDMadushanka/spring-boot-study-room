package com.edu.tdm.cmjd106.service.impl;

import com.edu.tdm.cmjd106.entity.Product;
import com.edu.tdm.cmjd106.repository.ProductRepository;
import com.edu.tdm.cmjd106.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Product CreateProduct(Product product) {
        return productRepository.save(product);
    }
}
