package com.zitel.ZitelTamrin2.data.service;

import com.zitel.ZitelTamrin2.data.entity.Order;
import com.zitel.ZitelTamrin2.data.entity.OrderToProduct;
import com.zitel.ZitelTamrin2.data.repository.OrderToProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderToProductService {
    @Autowired
    OrderToProductRepository orderToProductRepository;

    public OrderToProduct save(OrderToProduct otp){
        return orderToProductRepository.save(otp);
    }

    public List<OrderToProduct> getAll(){
        return orderToProductRepository.findAll();
    }



}
