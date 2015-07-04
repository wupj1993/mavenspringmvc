package com.wpj.work.dao;


import com.wpj.work.entity.T_user;
public interface T_userMapper {
    T_user selectByUserName(String userName);

    int deleteByPrimaryKey(Integer id);

    int insert(T_user record);

    int insertSelective(T_user record);

    T_user selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(T_user record);

    int updateByPrimaryKey(T_user record);
}