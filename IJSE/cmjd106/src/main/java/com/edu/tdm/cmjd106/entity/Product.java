package com.edu.tdm.cmjd106.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private Double price;

    private String description;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

}

/**
 * API request
 {
     "name": "Smartphone",
     "price": 299.99,
     "description": "A high-quality smartphone with a 6.5-inch display.",
     "category": {
     "id": 1
     }
 }

 */