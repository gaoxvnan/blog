package com.gaoxvnan.blog.admin.dao.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gaoxvnan.blog.admin.pojo.Admin;
import com.gaoxvnan.blog.admin.pojo.Permission;

import java.util.List;

public interface AdminMapper extends BaseMapper<Admin> {

    List<Permission> findPermissionsByAdminId(Long adminId);
}
