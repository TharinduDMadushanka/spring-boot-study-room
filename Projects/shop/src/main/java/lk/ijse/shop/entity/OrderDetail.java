package lk.ijse.shop.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "OrderDetail")
public class OrderDetail {

    @EmbeddedId
    private OrderDetailKey id;

    @ManyToOne
    @MapsId("orderId")
    @JoinColumn(name = "orderId")
    private Order orderId;

    @ManyToOne
    @MapsId("itemCode")
    @JoinColumn(name = "itemCode")
    private Item itemCode;

    private int orderQty;

    private int discount;

}
