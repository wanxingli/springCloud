package com.wx.springcloud.mapper;

import com.wx.springcloud.entities.Product;

import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
public interface ProductMapper {

    Product findOne(Long pid);

    List<Product> findAll();

    int addProduct(Product product);

}
