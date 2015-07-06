/*
 * Copyright (c) 2015 /5 /12
 * 	      7 :43 : 41
 *               By锛歸upeiji
 *               Q  Q锛�757671834
 * 	      It is not easy to meet each other in such a big world
 */

package com.wpj.service;


import com.wpj.work.entity.T_user;

/**
 * Created by wpj on 2015/3/26.
 *
 */
public interface UserService {
    T_user selectByUserName(String userName);
    int deleteByPrimaryKey(Integer id);

    int insert(T_user record);

    int insertSelective(T_user record);

    T_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_user record);

    int updateByPrimaryKey(T_user record);
}
