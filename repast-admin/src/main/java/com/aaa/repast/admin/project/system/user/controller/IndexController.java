package com.aaa.repast.admin.project.system.user.controller;

import com.aaa.repast.admin.framework.config.DouDouConfig;
import com.aaa.repast.admin.framework.web.controller.BaseController;
import com.aaa.repast.admin.project.system.menu.domain.Menu;
import com.aaa.repast.admin.project.system.menu.service.IMenuService;
import com.aaa.repast.admin.project.system.user.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * 首页 业务处理
 * 
 * @author Seven Lee
 */
@Controller
public class IndexController extends BaseController
{
    @Autowired
    private IMenuService menuService;

    @Autowired
    private DouDouConfig douDouConfig;

    // 系统首页
    @GetMapping("/index")
    public String index(ModelMap mmap)
    {
        // 取身份信息
        User user = getSysUser();
        // 根据用户id取出菜单
        List<Menu> menus = menuService.selectMenusByUser(user);
        mmap.put("menus", menus);
        mmap.put("user", user);
        mmap.put("copyrightYear", douDouConfig.getCopyrightYear());
        return "index";
    }

    // 系统介绍
    @GetMapping("/system/main")
    public String main(ModelMap mmap)
    {
        mmap.put("version", douDouConfig.getVersion());
        return "main";
    }
}
