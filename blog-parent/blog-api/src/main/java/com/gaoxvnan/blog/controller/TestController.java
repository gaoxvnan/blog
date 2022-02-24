package com.gaoxvnan.blog.controller;

import com.gaoxvnan.blog.dao.pojo.SysUser;
import com.gaoxvnan.blog.utils.UserThreadLocal;
import com.gaoxvnan.blog.vo.params.Result;
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
