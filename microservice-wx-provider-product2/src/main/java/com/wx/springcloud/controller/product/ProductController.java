package com.wx.springcloud.controller.product;

import com.wx.springcloud.entities.Product;
import com.wx.springcloud.service.ProductService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@RestController
@RequestMapping("/product/")
public class ProductController {

    @Resource
    private ProductService productService;

    @PostMapping("add")
    public boolean add(@RequestBody Product product) {
        return productService.addProduct(product);
    }

    @GetMapping("get/{id}")
    public Product get(@PathVariable("id") Long id){
        return productService.findOne(id);
    }

    @GetMapping("getAll")
    public List<Product> getAll(){
        return productService.findAll();
    }
}
