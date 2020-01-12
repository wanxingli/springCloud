package com.wx.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Createc by lwx0y01 on 2020/1/12
 */
@EnableConfigServer // 开启配置中心功能
@SpringBootApplication
public class ConfigerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConfigerApplication.class, args);
    }
}
