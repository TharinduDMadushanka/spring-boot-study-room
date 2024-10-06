package lk.ijse.shop.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate; // Change to LocalDate

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "customer")
public class Customer {

    @Id
    private String id;
    private String title;
    private String name;
    private LocalDate dob; // Changed from Date to LocalDate
    private double salary;
    private String address;
    private String city;
    private String province;
    private String postal;
}
