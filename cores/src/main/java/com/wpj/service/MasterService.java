/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service;


import com.wpj.work.entity.T_masters;

/**
 * Created by Server on 2015/5/30.
 */
public interface MasterService {
    int deleteByPrimaryKey(Integer eId);

    int insert(T_masters record);

    int insertSelective(T_masters record);

    T_masters selectByPrimaryKey(Integer eId);

    int updateByPrimaryKeySelective(T_masters record);

    int updateByPrimaryKey(T_masters record);
}
