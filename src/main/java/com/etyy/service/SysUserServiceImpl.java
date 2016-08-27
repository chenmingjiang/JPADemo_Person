package com.etyy.service;

import com.etyy.entity.SysRole;
import com.etyy.entity.SysUser;
import com.etyy.repository.SysRoleRepostiory;
import com.etyy.repository.SysUserRepostiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    SysUserRepostiory sysUserRepostiory;
    @Autowired
    SysRoleRepostiory sysRoleRepostiory;

    /***
     * 添加新用户
     * @param username 新用户名
     * @param password 新用户密码
     * @param roles 新用户拥有的权限
     * @return 新用户实体对象
     */
    @Override
    public SysUser save(String username, String password, Long roles) {
        SysUser user = new SysUser();
        user.setUsername(username);
        user.setPassword(password);
        SysRole sysRole = sysRoleRepostiory.findOne(roles);
        List<SysRole> sysRoleList = new ArrayList<SysRole>();
        sysRoleList.add(sysRole);
        user.setRoles(sysRoleList);
        SysUser sysUser = sysUserRepostiory.save(user);
        return sysUser;
    }

    @Override
    public SysUser findOneUser(Long id) {
        return sysUserRepostiory.findOne(id);
    }


}
