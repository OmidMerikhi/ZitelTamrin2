package com.zitel.ZitelTamrin2.data.service;

import com.zitel.ZitelTamrin2.data.entity.Customer;
import com.zitel.ZitelTamrin2.data.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;

    public Customer saveOrUpdateCustomer(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getCustomerById(Long id){
        return customerRepository.getCustomerById(id);
    }

    public List<Customer> getAllCustomer(){
        return customerRepository.findAll();
    }

    public List<Customer> searchCustomer(String value){
        return customerRepository.searchCustomer(value);
    }


}
