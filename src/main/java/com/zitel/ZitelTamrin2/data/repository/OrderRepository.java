package com.zitel.ZitelTamrin2.data.repository;

import com.zitel.ZitelTamrin2.data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    Order getOrderById(Long id);
}
