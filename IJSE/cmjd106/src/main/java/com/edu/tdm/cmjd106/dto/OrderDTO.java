package com.edu.tdm.cmjd106.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderDTO {
    private List<Long> productIds;
}

/**
 * This is a Data Transfer Object (DTO) that is used to carry data from the client to the server.
 * It contains a list of product IDs (productIds) that the user wants to order.
 * This DTO is used in the createOrder method of the OrderController.
 */