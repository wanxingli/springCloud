package com.wx.springcloud.controller;

import com.wx.springcloud.entities.Product;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;
import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@RestController
@RequestMapping("/product/consume/")
public class ProductConsumerController {

//    private String REST_URL = "http://localhost:10001";
    private String REST_URL = "http://MICROSERVICE-PRODUCT";
    @Resource
    RestTemplate restTemplate;

    @PostMapping("add")
    public boolean addProduct(Product product) {
        return restTemplate.postForObject(REST_URL + "/product/add", product, Boolean.class);
    }

    @GetMapping("get/{id}")
    public Product get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL + "/product/get/" + id, Product.class);
    }

    @GetMapping("getAll")
    public List<Product> getAll() {
        return restTemplate.getForObject(REST_URL + "/product/getAll", List.class);
    }
}
