/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service;


import com.github.pagehelper.PageInfo;
import com.wpj.work.entity.T_emptype;

/**
 * Created by Server on 2015/5/30.
 */
public interface EmpTypeService {
    /**
     * 软删除
     * @param tId 要删除的id
     * @return
     */
    int deleteByPrimaryKey(Integer tId);

    /**
     * 添加
     * @param record 业务类别对象
     * @return 影响行数
     */
    int insert(T_emptype record);

    /**&
     * 添加（推荐使用）
     * @param record 业务类别对象
     * @return 影响行数
     */
    int insertSelective(T_emptype record);

    /**
     * 根据id 获取业务类别的信息
     * @param tId 业务类别id
     * @return  业务类别对象
     */
    T_emptype selectByPrimaryKey(Integer tId);

    /**
     * 更新业务类别信息 （推荐使用）
     * @param record 要更新的对象
     * @return
     */
    int updateByPrimaryKeySelective(T_emptype record);

    /**
     * 要更新的对象
     * @param record
     * @return 影响行数 一般0
     */
    int updateByPrimaryKey(T_emptype record);

    /**
     * 根据分页获取业务信息
     * @param pageNum 页码
     * @param pageSize 每页大小
     * @return 业务的PageInfo对象集合
     */
    PageInfo<T_emptype> selectAll(int pageNum, int pageSize);
}
