package com.wx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

/**
 * Createc by lwx0y01 on 2020/1/12
 */
@EnableHystrixDashboard // 开启服务监控
@SpringBootApplication
public class HystrixDahboardApplication {
    public static void main(String[] args) {
        SpringApplication.run(HystrixDahboardApplication.class, args);
    }
}
