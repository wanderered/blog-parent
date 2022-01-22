package com.yunyi.blog.dao.pojo;

import lombok.Data;

@Data
public class SysUser {

    //@TableId (type = IdType.ASSIGN_ID) //默认id类型
    //以后用户多了之后， 要使用分表操作 id就需要用分布式id了
    private Long id;

    private String account;

    private Integer admin;

    private String avatar;

    private Long createDate;

    private Integer deleted;

    private String email;

    private Long lastLogin;

    private String mobilePhoneNumber;

    private String nickname;

    private String password;

    private String salt;

    private String status;
}
