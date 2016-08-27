package com.etyy.controller;

import com.etyy.entity.SysUser;
import com.etyy.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
@RestController
public class UserRestController {
    @Autowired
    private SysUserService sysUserService;

    /***
     * 添加单权限新用户
     * @param username 新用户名
     * @param password 新用户密码
     * @param roles 用户权限表的Id
     * @return JSON格式的用户的实体对象
     */
    @RequestMapping(value = "/insertSysUser")
    public SysUser insertSysUser(String username, String password, Long roles) {
        return sysUserService.save(username, password, roles);
    }

    /***
     * 查找单个用户
     * @param id
     * @return
     */
    @RequestMapping(value = "/sysuser/findOne")
    public SysUser findOneUser(Long id) {
        return sysUserService.findOneUser(id);
    }
}