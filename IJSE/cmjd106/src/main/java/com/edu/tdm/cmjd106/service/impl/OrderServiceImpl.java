package com.edu.tdm.cmjd106.service.impl;

import com.edu.tdm.cmjd106.entity.Order;
import com.edu.tdm.cmjd106.repository.OrderRepository;
import com.edu.tdm.cmjd106.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepository orderRepository;

    @Override
    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }

    @Override
    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}
