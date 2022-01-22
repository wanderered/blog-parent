package com.yunyi.blog.controller;

import com.yunyi.blog.dao.pojo.SysUser;
import com.yunyi.blog.utils.UserThreadLocal;
import com.yunyi.blog.vo.Result;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @RequestMapping
    public Result test(){
        SysUser sysUser = UserThreadLocal.get();
        System.out.println(sysUser);
        return Result.success(null);
    }
}