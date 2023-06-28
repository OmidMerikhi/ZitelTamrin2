package com.zitel.ZitelTamrin2.data.repository;

import com.zitel.ZitelTamrin2.data.entity.OrderToProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderToProductRepository extends JpaRepository<OrderToProduct,Long>{
}
