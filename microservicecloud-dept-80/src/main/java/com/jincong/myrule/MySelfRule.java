package com.jincong.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 自定义负载均衡规则
 * 
 * @author  j_cong
 * @date    2019/11/03
 * @version V1.0
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
        //我自定义为每个机器被访问5次
        return new RandomRule_ZY();
    }
}
