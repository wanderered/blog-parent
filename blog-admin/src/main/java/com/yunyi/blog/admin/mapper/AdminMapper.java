package com.yunyi.blog.admin.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yunyi.blog.admin.pojo.Admin;
import com.yunyi.blog.admin.pojo.Permission;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AdminMapper extends BaseMapper<Admin> {
    @Select("SELECT * FROM ms_permission WHERE id in (SELECT permission_id FROM ms_admin_permission where admin_id=#{adminId})")
    List<Permission> findPermissionByAdminId(Long adminId);
}