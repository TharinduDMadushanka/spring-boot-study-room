package lk.ijse.shop.services.impl;

import jakarta.transaction.Transactional;
import lk.ijse.shop.dto.OrderDto;
import lk.ijse.shop.entity.Customer;
import lk.ijse.shop.entity.Order;
import lk.ijse.shop.repository.ItemRepo;
import lk.ijse.shop.repository.OrderDetailRepo;
import lk.ijse.shop.repository.OrderRepo;
import lk.ijse.shop.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderRepo orderRepo;

    @Autowired
    private OrderDetailRepo orderDetailRepo;

    @Autowired
    private ItemRepo itemRepo;

    @Transactional
    @Override
    public String placeOrder(OrderDto orderDto) {

        Order order = new Order(orderDto.getOrderId(),new Customer(orderDto.getId()),orderDto.getDate());

    }
}
