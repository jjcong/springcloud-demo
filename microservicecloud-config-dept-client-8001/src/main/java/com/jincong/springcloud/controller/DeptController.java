package com.jincong.springcloud.controller;

import com.jincong.springcloud.entities.Dept;
import com.jincong.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
/**
 * 原始服务提供方
 * 
 * @author  j_cong
 * @date    2019/11/03
 * @version V1.0
 */
@RestController
public class DeptController
{
    @Autowired
    private DeptService service;
    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value="/dept/add",method=RequestMethod.POST)
    public boolean add(@RequestBody Dept dept)
    {
        return service.add(dept);
    }

    @RequestMapping(value="/dept/get/{id}",method=RequestMethod.GET)
    public Dept get(@PathVariable("id") Long id)
    {
        return service.get(id);
    }

    @RequestMapping(value="/dept/list",method=RequestMethod.GET)
    public List<Dept> list()
    {
        return service.list();
    }


    @GetMapping(value = "/dept/discovery")
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("************" + list);
        List<ServiceInstance> serviceInstanceList = client.getInstances("MICROSERVICECLOUD-DEPT");

        serviceInstanceList.forEach(service -> {
            System.out.println(service.getServiceId() + "\t" + service.getHost() + "\t"
                    + service.getPort() + "\t" + service.getUri());
        });

        return client;
    }

}


