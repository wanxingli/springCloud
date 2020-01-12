package com.wx.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Createc by lwx0y01 on 2020/1/12
 */
@RestController
public class ConfigClientController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${server.port}")
    private String port;
    //请求访问
    @RequestMapping("/config")
    public String getConfig() {
        String content = "applicationName:" + applicationName + ", port:" + port;
        System.out.println("content: " + content);
        return content;
    }
}
