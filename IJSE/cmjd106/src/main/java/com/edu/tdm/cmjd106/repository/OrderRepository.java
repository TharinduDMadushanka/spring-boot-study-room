package com.edu.tdm.cmjd106.repository;

import com.edu.tdm.cmjd106.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, Long> {
}
