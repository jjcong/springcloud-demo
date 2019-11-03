package com.jincong.springcloud.controller;

import com.jincong.springcloud.entities.Dept;
import com.jincong.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Feign 面向接口方式的Controller
 *
 * @author j_cong
 * @version V1.0
 * @date 2019/11/03
 */
@RestController
@RequestMapping(value = "consumer")
public class DeptController_Consumer {

    @Autowired
    private DeptClientService service;

    @RequestMapping(value = "/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/dept/list")
    public List<Dept> list() {
        return service.list();
    }

    @RequestMapping(value = "/dept/add")
    public Object add(Dept dept) {
        return service.add(dept);
    }


}
