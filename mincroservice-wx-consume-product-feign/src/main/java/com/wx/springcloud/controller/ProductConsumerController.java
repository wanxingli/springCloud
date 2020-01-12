package com.wx.springcloud.controller;

import com.wx.springcloud.entities.Product;
import com.wx.springcloud.service.ProductService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@RestController
@RequestMapping("/product/consume/")
public class ProductConsumerController {

    @Resource
    ProductService service;

    @RequestMapping("add")
    public boolean addProduct(Product product) {
        return service.addProduct(product);
    }

    @RequestMapping("get/{id}")
    public Product get(@PathVariable("id") Long id){
        return service.findOne(id);
    }

    @RequestMapping("getAll")
    public List<Product> getAll() {
        return service.findAll();
    }
}
