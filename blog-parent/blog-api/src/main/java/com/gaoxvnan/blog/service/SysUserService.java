package com.gaoxvnan.blog.service;

import com.gaoxvnan.blog.dao.pojo.SysUser;
import com.gaoxvnan.blog.vo.UserVo;
import com.gaoxvnan.blog.vo.params.Result;

public interface SysUserService {

    SysUser findUserById(Long id);

    SysUser findUser(String account, String password);

    /**
     * 根据token查询用户信息
     * @param token
     * @return
     */
    Result findUserByToken(String token);

    /**
     * 根据账户查找用户
     * @param account
     * @return
     */
    SysUser findUserByAccount(String account);

    /**
     * 保存用户信息
     * @param sysUser
     */
    void save(SysUser sysUser);

    /**
     * 根据id查询UserVo对象
     */
    UserVo findUserVoById(Long id);
}
