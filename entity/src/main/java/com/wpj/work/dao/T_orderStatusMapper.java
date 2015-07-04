/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.dao;


import com.wpj.work.entity.T_orderStatus;

public interface T_orderStatusMapper {
    int deleteByPrimaryKey(Integer sId);

    int insert(T_orderStatus record);

    int insertSelective(T_orderStatus record);

    T_orderStatus selectByPrimaryKey(Integer sId);

    int updateByPrimaryKeySelective(T_orderStatus record);

    int updateByPrimaryKey(T_orderStatus record);
}