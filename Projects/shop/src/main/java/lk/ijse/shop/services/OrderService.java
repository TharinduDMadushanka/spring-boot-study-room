package lk.ijse.shop.services;

import lk.ijse.shop.dto.OrderDto;
import org.springframework.stereotype.Service;

@Service
public interface OrderService {
    String placeOrder(OrderDto orderDto);
}
