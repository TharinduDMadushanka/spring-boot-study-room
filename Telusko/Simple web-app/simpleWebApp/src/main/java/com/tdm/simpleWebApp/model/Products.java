package com.tdm.simpleWebApp.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Products {

    private int prodId;
    private String prodName;
    private int price;

}

/**
 * @Data -> this is from lombok dependency.It will do add getter setter and  behind the scene
 * @AllArgsConstructor -> constructors create
 */