package lk.ijse.shop.services.impl;

import lk.ijse.shop.entity.Customer;
import lk.ijse.shop.repository.CustomerRepo; // Corrected package name
import lk.ijse.shop.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepo.save(customer);
    }

    @Override
    public Customer updateCustomer(String id, Customer customer) {
        Optional<Customer> existCustomerOptional = customerRepo.findById(id);

        if (existCustomerOptional.isPresent()) {
            Customer existCustomer = existCustomerOptional.get();
            existCustomer.setTitle(customer.getTitle()); // Adjusted field name
            existCustomer.setName(customer.getName()); // Adjusted field name
            existCustomer.setDob(customer.getDob()); // Adjusted field name
            existCustomer.setSalary(customer.getSalary());
            existCustomer.setAddress(customer.getAddress()); // Adjusted field name
            existCustomer.setCity(customer.getCity());
            existCustomer.setProvince(customer.getProvince());
            existCustomer.setPostal(customer.getPostal()); // Adjusted field name

            return customerRepo.save(existCustomer);
        } else {
            return null;  // Handle customer not found case
        }
    }

    @Override
    public void deleteCustomer(String id) {
        if (customerRepo.existsById(id)) {
            customerRepo.deleteById(id);
        }
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepo.findAll();
    }
}
