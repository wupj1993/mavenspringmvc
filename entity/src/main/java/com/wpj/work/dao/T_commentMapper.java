/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.dao;

import com.wpj.work.entity.T_comment;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface T_commentMapper {
    /**
     * xml 里面要用ResultMap
     * 获取所有的评论
     * @return
     */
    List<T_comment> selectAll(@Param("isdelete") Integer isdelete);

    /**
     * 根据评论id删除评论
     * @param cId
     * @return
     */
    int deleteByPrimaryKey(Integer cId);

    /**
     * 根据雇主id删除评论
     * @param cId
     * @return
     */
    int deleteByMasterKey(Integer cId);

    /**
     * 根据员工id 删除评论
     * @param cId
     * @return
     */
    int  deleteByEmpKey(Integer cId);
    /**
     * 根据员雇主id获取评论
     * @param eId 雇主id
     * @return 员工集合
     */

    List<T_comment> selectByMasterId(int eId);

    /**
     * 根据员员工id获取评论
     * @param empid 员工id
     * @return 员工集合
     */
    List<T_comment> selectByEmployeeId(int empid);

    /**
     * 添加评论
     * @param record 评论实体类
     * @return 影响行数
     */
    int insert(T_comment record);

    /**
     * 插入一条数据,只插入不为null的字段,不会影响有默认值的字段
     *支持Oracle序列,UUID,类似Mysql的INDENTITY自动增长(自动回写)
     *优先使用传入的参数值,参数值空时,才会使用序列、UUID,自动增长
     * @param record
     * @return
     */
    int insertSelective(T_comment record);

    /**
     * 根据评论id获取评论
     * @param cId
     * @return
     */
    T_comment selectByPrimaryKey(Integer cId);

    /**
     * 更新
     * @param record
     * @return
     */
    int updateByPrimaryKeySelective(T_comment record);

    int updateByPrimaryKey(T_comment record);
}