/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.dao;


import com.wpj.work.entity.T_emptype;

import java.util.List;

public interface T_emptypeMapper {
    int deleteByPrimaryKey(Integer tId);

    int insert(T_emptype record);

    int insertSelective(T_emptype record);

    T_emptype selectByPrimaryKey(Integer tId);

    int updateByPrimaryKeySelective(T_emptype record);
    List<T_emptype> selectAll();
    int updateByPrimaryKey(T_emptype record);
}