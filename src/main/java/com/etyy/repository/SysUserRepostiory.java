package com.etyy.repository;

import com.etyy.entity.SysUser;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
public interface SysUserRepostiory extends JpaRepository<SysUser, Long> {
    SysUser findByUsername(String username);

    SysUser save(SysUser sysUser);
}
