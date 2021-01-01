package com.candy.basic.service;

import com.candy.basic.entity.SysUser;
import com.candy.basic.mapper.SysUserMapper;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Classname SysUserService
 * @Description TODO
 * @Author liqb
 * @Date 2021/1/2 0:04
 */
@Slf4j
@Service
public class SysUserService {

    @Resource
    private SysUserMapper sysUserMapper;

    public SysUser getId(Long id) {
        return sysUserMapper.selectByPrimaryKey(id);
    }

}
