package com.wx.springcloud.service;

import com.wx.springcloud.entities.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/12
 */
@FeignClient(value = "MICROSERVICE-PRODUCT", fallback = ProductServiceFallBack.class)
public interface ProductService {

    @GetMapping("/product/get/{id}")
    Product findOne(Long pid);

    @GetMapping("/product/getAll")
    List<Product> findAll();

    @PostMapping("/product/add")
    boolean addProduct(Product product);

}
