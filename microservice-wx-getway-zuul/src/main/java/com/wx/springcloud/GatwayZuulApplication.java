package com.wx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * Createc by lwx0y01 on 2020/1/12
 */
@EnableZuulProxy // 开启zuul的功能
@SpringBootApplication
public class GatwayZuulApplication {
    public static void main(String[] args) {
        SpringApplication.run(GatwayZuulApplication.class, args);
    }
}
