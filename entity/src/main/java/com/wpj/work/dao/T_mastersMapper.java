/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.dao;


import com.wpj.work.entity.T_masters;

public interface T_mastersMapper {
    int deleteByPrimaryKey(Integer eId);

    int insert(T_masters record);

    int insertSelective(T_masters record);

    T_masters selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(T_masters record);

    int updateByPrimaryKey(T_masters record);
}