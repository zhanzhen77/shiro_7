package com.qf.oa.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.qf.oa.dao.IBaseDao;
import com.qf.oa.entity.Page;
import com.qf.oa.entity.SysUser;
import com.qf.oa.mapper.SysUserMapper;
import com.qf.oa.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl extends BaseServiceImpl<SysUser> implements ISysUserService{
    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public IBaseDao<SysUser> getDao() {
        return sysUserMapper;
    }

    @Override
    public PageInfo<SysUser> getUserPage(Page page) {
        PageHelper.startPage(page.getPageSize(),page.getCurrentPage());
          List<SysUser> userList =sysUserMapper.getUserList();
        return new PageInfo<>(userList);
    }
}
