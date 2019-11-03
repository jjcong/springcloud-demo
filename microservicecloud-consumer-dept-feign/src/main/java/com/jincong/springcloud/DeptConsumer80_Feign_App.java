package com.jincong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

/**
 * 消费端服务启动类
 *
 * @author  j_cong
 * @date    2019/11/03
 * @version V1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.jincong.springcloud"})
//@ComponentScan("com.jincong.springcloud")
public class DeptConsumer80_Feign_App {

    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_Feign_App.class, args);
    }
}
