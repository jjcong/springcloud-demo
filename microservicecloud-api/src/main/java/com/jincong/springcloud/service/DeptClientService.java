package com.jincong.springcloud.service;

import com.jincong.springcloud.entities.Dept;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Feign方式的接口
 *
 * @author j_cong
 * @version V1.0
 * @date 2019/11/03
 */
@FeignClient(value = "MICROSERVICECLOUD-DEPT")
public interface DeptClientService {

    @GetMapping(value = "/dept/get/{id}")
    Dept get(@PathVariable("id") long id);

    @GetMapping(value = "/dept/list")
    List<Dept> list();

    @PostMapping(value = "/dept/add")
    boolean add(Dept dept);
}
