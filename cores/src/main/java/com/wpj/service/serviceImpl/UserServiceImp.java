/*
 * Copyright (c) 2015 /5 /12
 * 	      9 :33 : 26
 *               Byï¼šwupeiji
 *               Q  Qï¼?757671834
 * 	      It is not easy to meet each other in such a big world
 */

package com.wpj.service.serviceImpl;

import com.wpj.service.UserService;
import com.wpj.work.dao.T_userMapper;
import com.wpj.work.entity.T_user;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by wpj on 2015/3/26.

 */
@Service
public class UserServiceImp implements UserService {
    @Resource
    private T_userMapper t_userMapper;
    @Override
    public T_user selectByUserName(String userName) {
        return t_userMapper.selectByUserName(userName);
    }

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(T_user record) {
        return 0;
    }

    @Override
    public int insertSelective(T_user record) {
        return 0;
    }

    @Override
    public T_user selectByPrimaryKey(Integer id) {
        return t_userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(T_user record) {
        return 0;
    }

    @Override
    public int updateByPrimaryKey(T_user record) {
        return 0;
    }

}
