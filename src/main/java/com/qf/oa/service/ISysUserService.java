package com.qf.oa.service;

import com.github.pagehelper.PageInfo;
import com.qf.oa.entity.Page;
import com.qf.oa.entity.SysUser;

public interface ISysUserService  extends  IBaseService<SysUser>{
    PageInfo<SysUser> getUserPage(Page page);
}
