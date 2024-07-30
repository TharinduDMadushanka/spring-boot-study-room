package com.tdm.simpleWebApp.model;

import lombok.Data;

@Data
public class Products {

    private int prodId;
    private String prodName;
    private int price;

}

/**
 * @Data -> this is from lombok dependency.It will do add getter setter and constructors behind the scene
 */