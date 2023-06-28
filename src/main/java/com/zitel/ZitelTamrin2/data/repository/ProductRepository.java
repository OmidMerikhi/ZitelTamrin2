package com.zitel.ZitelTamrin2.data.repository;

import com.zitel.ZitelTamrin2.data.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Product getProductById(Long id);
    @Query("from Product p where p.name like :value")
    List<Product> searchProduct(@Param("value") String value);
}
