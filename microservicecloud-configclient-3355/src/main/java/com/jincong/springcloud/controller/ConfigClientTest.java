package com.jincong.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * SpringCloud 分布式配置测试类
 * 
 * @author  j_cong
 * @date    2020/03/01
 * @version V1.0
 */
@RestController
public class ConfigClientTest {

    // 从配置文件中提取指定值
    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServiers;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        String result = "application: " + applicationName + "\n" +
                "eurekaServers: " + eurekaServiers + "\n" +
                "port： " + port;
        System.out.println(result);

        return result;
    }
}
