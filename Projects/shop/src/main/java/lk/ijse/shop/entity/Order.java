package lk.ijse.shop.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Orders")
public class Order {

    @Id
    private String orderId;

    private LocalDateTime orderDate;

    @ManyToOne
    @JoinColumn(name = "id", nullable = false)
    private Customer customer;

}
