package lk.ijse.shop.services;

import lk.ijse.shop.entity.Customer;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerService {
    Customer createCustomer(Customer customer);
    Customer updateCustomer(String id, Customer customer);
    void deleteCustomer(String id);
    List<Customer> getAllCustomers();
}
