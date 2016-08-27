package com.etyy.repository;

import com.etyy.entity.SysRole;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by chenmingjiang on 2016/8/27.
 */
public interface SysRoleRepostiory extends CrudRepository<SysRole, Long> {
    @Override
    SysRole findOne(Long aLong);
}
