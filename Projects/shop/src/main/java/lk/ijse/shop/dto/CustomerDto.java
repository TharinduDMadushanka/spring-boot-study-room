package lk.ijse.shop.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class CustomerDto {
    private String id;
    private String title;
    private String name;
    private LocalDate dob; // Use LocalDate
    private double salary;
    private String address;
    private String city;
    private String province;
    private String postal;
}
