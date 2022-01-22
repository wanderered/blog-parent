package com.yunyi.blog.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.yunyi.blog.dao.mapper.SysUserMapper;
import com.yunyi.blog.dao.pojo.SysUser;
//import com.yunyi.blog.service.LoginService;
import com.yunyi.blog.service.SysUserService;
import com.yunyi.blog.vo.ErrorCode;
import com.yunyi.blog.vo.LoginUserVo;
import com.yunyi.blog.vo.Result;
import com.yunyi.blog.vo.UserVo;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;
    @Autowired
    private RedisTemplate<String,String> redisTemplate;
//    @Autowired
//    private LoginService loginService;

    @Override
    public UserVo findUserVoById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null){
            sysUser = new SysUser();
            sysUser.setId(1L);
            sysUser.setAvatar("/static/img/logo.b3a48c0.png");
            sysUser.setNickname("yunyi");
        }
        UserVo userVo = new UserVo();
        BeanUtils.copyProperties(sysUser, userVo);
        return userVo;
    }

    @Override
    public SysUser findUserById(Long id) {
        SysUser sysUser = sysUserMapper.selectById(id);
        if (sysUser == null){
            sysUser = new SysUser();
            sysUser.setNickname("yunyi");
        }
        return sysUser;
    }

//    @Override
//    public SysUser findUser(String account, String password) {
//        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(SysUser::getAccount, account);
//        queryWrapper.eq(SysUser::getPassword, password);
//        queryWrapper.select(SysUser::getAccount, SysUser::getId, SysUser::getAvatar, SysUser::getNickname);
//        queryWrapper.last("limit 1");
//
//        return sysUserMapper.selectOne(queryWrapper);
//    }

//    @Override
//    public Result findUserByToken(String token) {
//        /**
//         * 1. token validation
//         *      if null, 解析是否成功 redis是否存在
//         * 2. 如果失败 返回错误
//         * 3. 如果车工 返回对应的结果 LoginUserVo
//         */
//
//        SysUser sysUser = loginService.checkToken(token);
//        if(sysUser == null){
//            Result.fail(ErrorCode.TOKEN_ERROR.getCode(), ErrorCode.TOKEN_ERROR.getMsg());
//        }
//
//        LoginUserVo loginUserVo = new LoginUserVo();
//        loginUserVo.setId(sysUser.getId());
//        loginUserVo.setNickname(sysUser.getNickname());
//        loginUserVo.setAvatar(sysUser.getAvatar());
//        loginUserVo.setAccount(sysUser.getAccount());
//        return Result.success(loginUserVo);
//    }

//    @Override
//    public SysUser findUserByAccount(String account) {
//        LambdaQueryWrapper<SysUser> queryWrapper = new LambdaQueryWrapper<>();
//        queryWrapper.eq(SysUser::getAccount,account);
//        queryWrapper.last("limit 1");
//        return this.sysUserMapper.selectOne(queryWrapper);
//    }
//
//    @Override
//    public void save(SysUser sysUser) {
//        //保存用户这 id会自动生成
//        //这个地方默认生成的id是分布式id， 雪花算法
//        this.sysUserMapper.insert(sysUser);
//    }
}
