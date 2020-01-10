package com.wx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@SpringBootApplication
@MapperScan("com.wx.springcloud.mapper")
public class ProductProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductProviderApplication.class, args);
    }
}
