package lk.ijse.shop.repository;

import lk.ijse.shop.entity.OrderDetail;
import lk.ijse.shop.entity.OrderDetailKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDetailRepo extends JpaRepository<OrderDetail, OrderDetailKey> {
}
