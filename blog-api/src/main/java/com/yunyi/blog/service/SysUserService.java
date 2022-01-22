package com.yunyi.blog.service;

import com.yunyi.blog.dao.pojo.SysUser;
import com.yunyi.blog.vo.Result;
import com.yunyi.blog.vo.UserVo;

public interface SysUserService {

    UserVo findUserVoById (Long id);


    SysUser findUserById(Long id);



    SysUser findUser(String account, String password);



    /**
     * find user infor base on token
     * @param token
     * @return
     */
    Result findUserByToken(String token);
//
//    /**
//     * 根据账户查找用户
//     * @param account
//     * @return
//     */
//    SysUser findUserByAccount(String account);
//
//    /**
//     * 保存用户
//     * @param sysUser
//     */
//    void save(SysUser sysUser);
}
