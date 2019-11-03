package com.jincong.springcloud.controller;

import com.jincong.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * 消费者Controller
 *
 * @author j_cong
 * @version V1.0
 * @date 2019/11/03
 */
@RestController
@RequestMapping(value = "consumer")
public class DeptController_Consumer {

    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
    /**
     * RestTemplate三个参数
     * url：rest请求地址
     * requestMap: 请求参数
     * ResponseBean.class : http响应转换成的对象
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "dept/add")
    public boolean add(Dept dept) {
        return restTemplate.postForObject(REST_URL_PREFIX + "/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/get/" + id, Dept.class);
    }

    @RequestMapping(value = "dept/list")
    public List<Dept> list() {
        return restTemplate.getForObject(REST_URL_PREFIX + "/dept/list", List.class);
    }

    //测试@EnableDiscoveryClient,消费端可以调用服务发现
    @RequestMapping(value = "/dept/discovery")
    public Object discovery() {
        return restTemplate.getForEntity(REST_URL_PREFIX + "/dept/discovery", Object.class);
    }


}
