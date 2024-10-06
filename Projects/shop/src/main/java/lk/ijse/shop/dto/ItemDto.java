package lk.ijse.shop.dto;

import lombok.Data;

@Data
public class ItemDto {

    private String itemCode;
    private String description;
    private String pack;
    private Integer qoh;
    private Double unitPrice;

}
