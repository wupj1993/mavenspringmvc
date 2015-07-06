/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service;


import com.wpj.work.entity.T_order;

/**
 * Created by Server on 2015/5/30.
 */
public interface OrderService {
    int deleteByPrimaryKey(String oId);

    int insert(T_order record);

    int insertSelective(T_order record);

    T_order selectByPrimaryKey(String oId);

    int updateByPrimaryKeySelective(T_order record);

    int updateByPrimaryKey(T_order record);
}
