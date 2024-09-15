package com.edu.tdm.cmjd106.controller;

import com.edu.tdm.cmjd106.dto.ProductReqDTO;
import com.edu.tdm.cmjd106.entity.Category;
import com.edu.tdm.cmjd106.entity.Product;
import com.edu.tdm.cmjd106.service.CategoryService;
import com.edu.tdm.cmjd106.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getAllProducts() {
        List<Product> products = productService.getAllProducts();

        return ResponseEntity.status(200).body(products);
    }

    @PostMapping("/products")
    public ResponseEntity<Product> createProduct(@RequestBody ProductReqDTO productReqDTO) {

        Product product = new Product();
        product.setName(productReqDTO.getName());
        product.setPrice(productReqDTO.getPrice());
        product.setDescription(productReqDTO.getDescription());

        //find category by categoryId in productReqDTO and assign it to new Product.
        Category category = categoryService.getCategoryById(productReqDTO.getCategoryId());
        product.setCategory(category);

        Product createdProduct = productService.createProduct(product);

        return ResponseEntity.status(201).body(createdProduct);
    }

    @PutMapping("/products/{productId}")
    public ResponseEntity<Product> updateProduct(@PathVariable Long productId, @RequestBody ProductReqDTO productReqDTO) {

        Product product = new Product();
        product.setName(productReqDTO.getName());
        product.setPrice(productReqDTO.getPrice());
        product.setDescription(productReqDTO.getDescription());

        //find category by categoryId in productReqDTO and assign it to new Product.
        Category category = categoryService.getCategoryById(productReqDTO.getCategoryId());
        product.setCategory(category);

        Product updatedProduct = productService.updateProduct(productId, product);

        return ResponseEntity.status(201).body(updatedProduct);
    }

}
