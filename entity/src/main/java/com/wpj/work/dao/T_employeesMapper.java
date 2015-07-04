/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.dao;


import com.wpj.work.entity.T_employees;

import java.util.List;

public interface T_employeesMapper {
    int deleteByPrimaryKey(Integer eId);
    int insert(T_employees record);
    int insertSelective(T_employees record);
    List<T_employees> selectAllByPage();
    T_employees selectByPrimaryKey(Integer eId);
    List<T_employees> selectByPrimaryKey();
    int updateByPrimaryKeySelective(T_employees record);
    int updateByPrimaryKey(T_employees record);
}