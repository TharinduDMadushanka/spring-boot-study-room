package com.ijse.springintro.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductRequestDto {
    private String name;
    private Double price;
    private String description;
    private Long categoryId;
}
