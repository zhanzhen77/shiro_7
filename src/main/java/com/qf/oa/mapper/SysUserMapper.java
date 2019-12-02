package com.qf.oa.mapper;

import  com.qf.oa.dao.IBaseDao;
import com.qf.oa.entity.SysUser;

import java.util.List;

public interface SysUserMapper extends IBaseDao<SysUser> {
    int deleteByPrimaryKey(Long userId);

    int insert(SysUser record);

    int insertSelective(SysUser record);

    SysUser selectByPrimaryKey(Long userId);

    int updateByPrimaryKeySelective(SysUser record);

    int updateByPrimaryKey(SysUser record);

    List<SysUser> getUserList();
}