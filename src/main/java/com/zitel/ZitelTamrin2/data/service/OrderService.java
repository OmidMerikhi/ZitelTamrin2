package com.zitel.ZitelTamrin2.data.service;

import com.zitel.ZitelTamrin2.data.entity.Order;
import com.zitel.ZitelTamrin2.data.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderRepository orderRepository;

    public List<Order> getAllOrder(){
        return orderRepository.findAll();
    }

    public Order saveOrder(Order order){
        return orderRepository.save(order);
    }
    public Order getOrderById(Long id){
        return orderRepository.getOrderById(id);
    }

    public List<Order> getOrderByCustomer(Long customerId){
        return orderRepository.getOrderByCustomerId(customerId);
    }


}
