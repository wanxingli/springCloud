package com.wx.springcloud;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@EnableEurekaClient
@MapperScan("com.wx.springcloud.mapper")
@SpringBootApplication
public class ProductProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductProviderApplication.class, args);
    }
}
