package com.edu.tdm.cmjd106.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductReqDTO {

    private String name;
    private Double price;
    private String description;
    private Long categoryId;

}

/**
 * Api request
 {
     "name": "Radio",
     "price": 249.99,
     "description": "An  high-quality Radio.",
     "categoryId": 1
 }
 */
