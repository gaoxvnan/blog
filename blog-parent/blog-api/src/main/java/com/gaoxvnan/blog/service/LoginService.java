package com.gaoxvnan.blog.service;

import com.gaoxvnan.blog.dao.pojo.SysUser;
import com.gaoxvnan.blog.vo.params.LoginParam;
import com.gaoxvnan.blog.vo.params.Result;

public interface LoginService {
    /**
     * 登录功能
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);

    SysUser checkToken(String token);

    Result logout(String token);

    Result register(LoginParam loginParam);
}
