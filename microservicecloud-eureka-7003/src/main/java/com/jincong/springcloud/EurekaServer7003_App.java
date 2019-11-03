package com.jincong.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Eureka Server 7001
 *
 * @author  j_cong
 * @date    2019/11/03
 * @version V1.0
 */
@SpringBootApplication
//EurekaServer服务器端启动类,接受其它微服务注册进来

@EnableEurekaServer
public class EurekaServer7003_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_App.class, args);
    }
}
