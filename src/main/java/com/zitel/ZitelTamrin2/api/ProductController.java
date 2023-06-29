package com.zitel.ZitelTamrin2.api;

import com.zitel.ZitelTamrin2.data.entity.Product;
import com.zitel.ZitelTamrin2.data.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;

    @PostMapping("/saveProduct")
    public Product saveProduct(@RequestBody Product product){
        return productService.saveOrUpdateProduct(product);
    }

    @PutMapping("/editProduct")
    public Product editProduct(@RequestBody Product product){
        return productService.saveOrUpdateProduct(product);
    }

    @GetMapping("/getAllProduct")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }

    @GetMapping("/searchProduct/{value}")
    public List<Product> searchProduct(@PathVariable("value") String value){
        return productService.searchProduct(value);
    }

}
