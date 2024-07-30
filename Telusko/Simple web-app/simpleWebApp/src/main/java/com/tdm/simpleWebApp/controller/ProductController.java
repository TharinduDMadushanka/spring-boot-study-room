package com.tdm.simpleWebApp.controller;

import com.tdm.simpleWebApp.model.Products;
import com.tdm.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    @RequestMapping("/product")
    public List<Products> getProducts(){
        return service.getProducts();
    }

}
