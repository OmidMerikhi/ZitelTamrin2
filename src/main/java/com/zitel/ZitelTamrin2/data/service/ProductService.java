package com.zitel.ZitelTamrin2.data.service;

import com.zitel.ZitelTamrin2.data.entity.Product;
import com.zitel.ZitelTamrin2.data.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    @Autowired
    ProductRepository productRepository;

    public Product saveOrUpdateProduct(Product product){
        return productRepository.save(product);
    }

    public List<Product> getAllProduct(){
        return productRepository.findAll();
    }

    public List<Product> searchProduct(String value){
        return productRepository.searchProduct(value);
    }
}
