package lk.ijse.shop.repository; // Corrected package name

import lk.ijse.shop.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepo extends JpaRepository<Customer, String> {
}
