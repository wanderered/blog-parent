package com.yunyi.blog.service;

import com.yunyi.blog.dao.pojo.SysUser;
import com.yunyi.blog.vo.Result;
import com.yunyi.blog.vo.params.LoginParam;


public interface LoginService {
    /**
     * login
     * @param loginParam
     * @return
     */
    Result login(LoginParam loginParam);



    SysUser checkToken(String token);


//
    /**
     * logout
     * @param token
     * @return
     */
    Result logout(String token);



    /**
     * register
     * @param loginParam
     * @return
     */
    Result register(LoginParam loginParam);
}
