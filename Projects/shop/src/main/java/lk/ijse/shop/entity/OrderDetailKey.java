package lk.ijse.shop.entity;

import jakarta.persistence.Embeddable;

import java.io.Serializable;

@Embeddable
public class OrderDetailKey implements Serializable {
    private String orderId;
    private String itemCode;
}
