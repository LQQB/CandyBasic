package com.candy.basic.controller;

import com.candy.basic.entity.SysUser;
import com.candy.basic.service.SysUserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname HelloController
 * @Description TODO
 * @Author liqb
 * @Date 2021/1/1 17:21
 */
@RestController
public class HelloController {

    @Resource
    private SysUserService sysUserService;

    @GetMapping("/hello")
    public String hello() {
        return "ddddd";
    }


    @GetMapping("/getId")
    public SysUser getId(Long id) {
        return sysUserService.getId(id);
    }


}
