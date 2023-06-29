package com.zitel.ZitelTamrin2.api;

import com.zitel.ZitelTamrin2.data.entity.Order;
import com.zitel.ZitelTamrin2.data.service.OrderService;
import com.zitel.ZitelTamrin2.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {
    @Autowired
    OrderService orderService;

    @Autowired
    ProductService productService;


    @PostMapping("/saveOrder")
    public Order saveOrder(@RequestBody Order order) throws Exception{
        var customerProducts=order.getProducts();
        var totalPrice=0;
        for(var p:customerProducts){
            if(p.getStock()>=1){
                p.setStock(p.getStock()-1);
                productService.saveOrUpdateProduct(p);
                totalPrice+=p.getPrice();
            }else {
                throw new Exception("product many is 0 in stock!");
            }

        }
        order.setTotalPrice(totalPrice);
        return orderService.saveOrder(order);
    }

    @GetMapping("/getOrderByCustomer")
    public List<Order> getOrderByCusotmer(@RequestParam("cusotmerId") Long id){
        return orderService.getOrderByCustomer(id);
    }

    @GetMapping("/getAllOrder")
    public List<Order> getAllOrder(){
        return orderService.getAllOrder();
    }


}
