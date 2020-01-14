package com.wx.springcloud.service;

import com.wx.springcloud.entities.Product;

import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
public interface ProductService {

    Product findOne(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);

}
