package com.tdm.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Products {

    @Id
    private int prodId;
    private String prodName;
    private int price;

    public Products() {
    }

}

/**
 * @Data -> this is from lombok dependency.It will do add getter setter and  behind the scene
 * @AllArgsConstructor -> constructors create
 * @Entity -> used at the class level and marks the class as a persistent entity.
 * @Id -> this member will uniquely identify the entity in the database.(Primary Key)
 */