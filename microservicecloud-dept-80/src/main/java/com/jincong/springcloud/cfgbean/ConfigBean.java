package com.jincong.springcloud.cfgbean;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * 相当于配置文件,相当于applicationContext.xml
 *
 * @author  j_cong
 * @date    2019/11/03
 * @version V1.0
 */
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return  new RestTemplate();
    }

    /**
     * 自定义负载均衡算法
     * @return  自定义LB算法
     */
    @Bean
    public IRule myRule() {
        return new RandomRule();
    }
}
