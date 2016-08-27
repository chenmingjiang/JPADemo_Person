package com.etyy.service;

import com.etyy.entity.SysUser;
import org.springframework.stereotype.Service;

/**
 * Created by chenmingjiang on 2016/8/27.
 */

public interface SysUserService {

    SysUser save(String username, String password, Long roles);

    SysUser findOneUser(Long id);

}
