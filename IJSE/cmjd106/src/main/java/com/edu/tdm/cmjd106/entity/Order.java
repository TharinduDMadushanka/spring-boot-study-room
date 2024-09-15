package com.edu.tdm.cmjd106.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "orders")
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDateTime orderDateTime;

    private Double totalPrice;

    @PrePersist //executes before the entity is created
    protected void onCreate() {
        if (this.orderDateTime == null) {
            this.orderDateTime = LocalDateTime.now();
        }
    }

    @ManyToMany
    @JoinTable(
            name = "order_product",
            joinColumns = @JoinColumn(name = "orderId"),
            inverseJoinColumns = @JoinColumn(name = "productId")
    )
    private List<Product> orderedProducts;
}

/**
 * Order is an entity that represents the order table in the database.
 * It has fields like id, orderDateTime, totalPrice, and orderedProducts.
 * The @PrePersist annotation ensures that the order's orderDateTime is set
   to the current date and time before the entity is persisted in the database.
 * The @ManyToMany relationship maps the association between the Order and Product entities.
 * Each order can contain multiple products, and each product can belong to multiple orders.
 * The relationship is mapped by the order_product table.
 */