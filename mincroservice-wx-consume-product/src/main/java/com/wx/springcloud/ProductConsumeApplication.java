package com.wx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * Createc by lwx0y01 on 2020/1/10
 */
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumeApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductConsumeApplication.class, args);
    }

}
