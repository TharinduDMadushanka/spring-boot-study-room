package com.tdm.simpleWebApp.controller;

import com.tdm.simpleWebApp.model.Products;
import com.tdm.simpleWebApp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    ProductService service;

    //@RequestMapping("/product")
    @GetMapping("/product")
    public List<Products> getProducts(){
        return service.getProducts();
    }

    //@RequestMapping("/product/{prodId}")
    @GetMapping("/product/{prodId}")
    public Products getProductById(@PathVariable int prodId){
        return service.getProductById(prodId);
    }

    //@RequestMapping("/product")
    @PostMapping("/product")
    public void addProduct(@RequestBody Products prod){
        System.out.println(prod);
        service.addProducts(prod);
    }

    @PutMapping("/product")
    public void updateProduct(@RequestBody Products prod){
        service.updateProduct(prod);
    }

    @DeleteMapping("/product/{prodId}")
    public void deleteProduct(@PathVariable int prodId){
        service.deleteProduct(prodId);
    }

}

/**
 * @RestController ->  simplify the creation of RESTful web services
        * combines @Controller and @ResponseBody, which eliminates the need to annotate every request handling method of the
          controller class with the @ResponseBody annotation

 * @Autowired -> used for automatic dependency injection

 * {prodId} -> the value came in the request will be mapped in to prodId
 * if we want to match these 2 we should use @PathVariable this annotation

 *   @RequestMapping("/product/102") -> if we send request like this the error shows
 "Optional int parameter 'prodId' is present but cannot be translated into a null value due to being declared as a primitive type. "

 * @RequestMapping("/product") -> if there more than one request with same name it will be a problem so that we can use specialized
   requests like GET,PUT,DELETE,POST

 * if we send body from client to the server(post) we should use @RequestBody
 */