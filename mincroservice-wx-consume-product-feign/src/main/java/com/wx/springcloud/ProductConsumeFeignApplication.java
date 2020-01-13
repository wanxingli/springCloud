package com.wx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * Createc by lwx0y01 on 2020/1/12
 */
// @EnableFeignClients会扫描标记了指定包下@FeignClient注解的接口，并生成此接口的代理对象
@EnableFeignClients(basePackages = {"com.wx.springcloud"})
@EnableHystrix // 开启 Hystrix 熔断机制的支持
@EnableEurekaClient
@SpringBootApplication
public class ProductConsumeFeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductConsumeFeignApplication.class, args);
    }
}
