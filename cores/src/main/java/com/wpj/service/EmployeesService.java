/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service;


import com.github.pagehelper.PageInfo;
import com.wpj.work.entity.T_comment;
import com.wpj.work.entity.T_employees;

/**
 * Created by Server on 2015/5/30.
 */
public interface EmployeesService {
    /**
     * 删除员工信息
     * @param eId
     * @return
     */
    int deleteByPrimaryKey(Integer eId);
    /**
     * 员工id获取评论
     * @param id
     * @return
     */
    PageInfo<T_comment> selectCommentByEmployeeId(int id, int pageNum, int pageSize);

    /**
     * 新建员工
     * @param record 员工信息
     * @return
     */
    int insert(T_employees record);
    /**
     * 根据分页查询员工信息
     * @param page_Num 页码
     * @param page_Size 每页大小
     * @return
     */
    PageInfo<T_employees> selectEmployee(int page_Num, int page_Size);

    /**
     * 新建员工 (推荐使用)
     * @param record 员工信息
     * @return
     */
    int insertSelective(T_employees record);

    /**
     * 根据id获取员工信息
     * @param eId
     * @return
     */
    T_employees selectByPrimaryKey(Integer eId);

    /**
     * 更新信息
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T_employees record);

    int updateByPrimaryKey(T_employees record);
}
