package com.edu.tdm.cmjd106.service;

import com.edu.tdm.cmjd106.entity.Order;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OrderService {
    List<Order> getAllOrders();
    Order createOrder(Order order);
}
