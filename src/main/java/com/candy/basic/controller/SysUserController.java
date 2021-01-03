package com.candy.basic.controller;

import com.candy.basic.common.CbMessage;
import com.candy.basic.entity.SysUser;
import com.candy.basic.form.SysRegForm;
import com.candy.basic.form.SysUserForm;
import com.candy.basic.service.SysUserService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname SysUserController
 * @Description TODO
 * @Author liqb
 * @Date 2021/1/3 22:07
 */
@RestController
public class SysUserController {

    @Resource
    private SysUserService sysUserService;

    @PostMapping("/user/register")
    public CbMessage register(@Validated @RequestBody SysRegForm sysRegForm ) {
        SysUserForm sysUserForm = sysUserService.register(sysRegForm);
        return CbMessage.ok(sysUserForm);
    }


}
