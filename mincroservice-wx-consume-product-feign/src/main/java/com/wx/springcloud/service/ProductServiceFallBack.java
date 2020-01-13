package com.wx.springcloud.service;

import com.wx.springcloud.entities.Product;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/12
 */
@Component
public class ProductServiceFallBack implements ProductService {
    @Override
    public Product findOne(Long pid) {
        return new Product(pid, "id="+ pid + "无数据--feign&hystrix", "无有效数据库");
    }

    @Override
    public List<Product> findAll() {
        return null;
    }

    @Override
    public boolean addProduct(Product product) {
        return false;
    }
}
