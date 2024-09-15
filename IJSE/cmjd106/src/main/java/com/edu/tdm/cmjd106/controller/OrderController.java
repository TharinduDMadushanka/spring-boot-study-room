package com.edu.tdm.cmjd106.controller;

import com.edu.tdm.cmjd106.dto.OrderDTO;
import com.edu.tdm.cmjd106.entity.Order;
import com.edu.tdm.cmjd106.entity.Product;
import com.edu.tdm.cmjd106.service.OrderService;
import com.edu.tdm.cmjd106.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @Autowired
    private ProductService productService;

    @GetMapping("/orders")
    public ResponseEntity<List<Order>> getAllOrders() {
        List<Order> orders = orderService.getAllOrders();

        return ResponseEntity.status(200).body(orders);
    }

    @PostMapping("/orders")
    public ResponseEntity<Order> createOrder(@RequestBody OrderDTO orderDTO) {

        Order order = new Order();
        order.setTotalPrice(0.0);

        //get product Ids from order dto to productIds array
        List<Long> productIds = orderDTO.getProductIds();

        List<Product> orderedProducts = new ArrayList<>();

        productIds.forEach(productId -> {
            //get product by the product Id
            Product product = productService.getProductById(productId);

            if (product != null) {
                orderedProducts.add(product);

                order.setTotalPrice(order.getTotalPrice() + product.getPrice());
            }
        });

        order.setOrderedProducts(orderedProducts);

        //save the order in DB
        orderService.createOrder(order);

        return ResponseEntity.status(201).body(order);

    }

}
