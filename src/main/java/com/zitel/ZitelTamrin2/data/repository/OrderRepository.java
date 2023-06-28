package com.zitel.ZitelTamrin2.data.repository;

import com.zitel.ZitelTamrin2.data.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
    Order getOrderById(Long id);
    @Query("from Order o where o.customer.id=:id")
    List<Order> getOrderByCustomerId(@Param("id") Long customerId);

}
