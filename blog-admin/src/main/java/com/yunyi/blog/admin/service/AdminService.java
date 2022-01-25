package com.yunyi.blog.admin.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yunyi.blog.admin.mapper.AdminMapper;
import com.yunyi.blog.admin.mapper.PermissionMapper;
import com.yunyi.blog.admin.pojo.Admin;
import com.yunyi.blog.admin.pojo.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;
    @Autowired
    private PermissionMapper permissionMapper;

    public Admin findAdminByUserName(String username){
        LambdaQueryWrapper<Admin> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Admin::getUsername,username).last("limit 1");
        Admin adminUser = adminMapper.selectOne(queryWrapper);
        return adminUser;
    }





    public List<Permission> findPermissionByAdminId(Long adminId) {
        //SELECT * FROM `ms_permission` WHERE id in (SELECT permission_id FROM ms_admin_permission where admin_id=1)
        return adminMapper.findPermissionByAdminId(adminId);
    }
}