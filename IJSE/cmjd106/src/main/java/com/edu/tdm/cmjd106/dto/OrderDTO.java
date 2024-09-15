package com.edu.tdm.cmjd106.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class OrderDTO {
    private List<Long> productIds;
}
