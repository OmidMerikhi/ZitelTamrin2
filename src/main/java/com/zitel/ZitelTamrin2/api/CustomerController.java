package com.zitel.ZitelTamrin2.api;

import com.zitel.ZitelTamrin2.data.entity.Customer;
import com.zitel.ZitelTamrin2.data.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerService customerService;

    @PostMapping("/saveCusotmer")
    public Customer saveCustomer(@RequestBody Customer customer){
        return customerService.saveOrUpdateCustomer(customer);
    }

    @PutMapping("/editCustomer")
    public Customer editCustomer(@RequestBody Customer customer){
        return customerService.saveOrUpdateCustomer(customer);
    }

    @GetMapping("getAllCustomer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @GetMapping("getCustomerById")
    public Customer getCustomerById(Long id){
        return customerService.getCustomerById(id);
    }

    @GetMapping("/searchCustomer/{value}")
    public List<Customer> searchCustomer(@PathVariable("value") String value){
        return customerService.searchCustomer(value);
    }

}
