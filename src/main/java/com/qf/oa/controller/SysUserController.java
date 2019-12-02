package com.qf.oa.controller;

import com.github.pagehelper.PageInfo;
import com.qf.oa.entity.Page;
import com.qf.oa.entity.SysUser;
import com.qf.oa.service.ISysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("sysUser")
public class SysUserController {
    @Autowired
    private ISysUserService sysUserService;

    @RequestMapping("getById")
    @ResponseBody
    public SysUser getById(long userId){
        SysUser sysUser = sysUserService.selectByPrimaryKey(userId);
        return sysUser;

    }

    //用户分页
    @RequestMapping("page")
    public String page(Page page, ModelMap map){
      PageInfo<SysUser> pageInfo = sysUserService.getUserPage(page);
      map.put("pageInfo",pageInfo);
        return "user/userList";
    }
}
