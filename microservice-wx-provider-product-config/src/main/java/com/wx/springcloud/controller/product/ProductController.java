package com.wx.springcloud.controller.product;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
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

    /*
      当get方法出现异常时，则会调用hystrixGet方法处理
     */
    @HystrixCommand(fallbackMethod = "getFallback")
    @GetMapping("get/{id}")
    public Product get(@PathVariable("id") Long id){
        Product product = productService.findOne(id);
        if (product == null) {
            throw new RuntimeException();
        }
        return product;
    }

    @GetMapping("getAll")
    public List<Product> getAll(){
        return productService.findAll();
    }

    /*
      当get方法出现异常时，则会调用此方法. 注意此方法的返回值，参数列表与原方法一致
     */
    public Product getFallback(@PathVariable("id") Long id) {
        return new Product(id, "ID=" + id + "无效--@HystrixCommand", "无有效数据库");
    }
}
