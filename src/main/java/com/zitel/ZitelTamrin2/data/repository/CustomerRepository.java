package com.zitel.ZitelTamrin2.data.repository;

import com.zitel.ZitelTamrin2.data.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    Customer getCustomerById(Long id);
    @Query("from Customer customer where customer.firstName like :value or customer.lastName like :value")
    List<Customer> searchCustomer(@Param("value") String value);

}
