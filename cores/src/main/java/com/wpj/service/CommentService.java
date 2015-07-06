package com.wpj.service;


import com.github.pagehelper.PageInfo;
import com.wpj.work.entity.T_comment;

/**
 * Created by Server on 2015/5/30.
 * 评论
 */

public interface CommentService {
    /**
     * 根据评论id删除软删除
     * @param cId  要删除的id
     * @return
     */
    int deleteByPrimaryKey(Integer cId);
    /**
     * 根据雇主id删除评论
     * @param cId 雇主id
     * @return
     */
    int deleteByMasterKey(Integer cId);

    /**
     * 根据员工id 删除评论
     * @param cId 员工id
     * @return
     */
    int  deleteByEmpKey(Integer cId);
    /**
     * 增加评论
     * @param record
     * @return
     */
    int insert(T_comment record);

    int insertSelective(T_comment record);

    /**
     * 查询
     * @param cId
     * @return
     */
    T_comment selectByPrimaryKey(Integer cId);

    /**
     * 根据雇主id查询最近的评论
     * @param eId 雇主id
     * @param page_Num 页码
     * @param page_Size 每一页的大小
     * @return
     */
    PageInfo<T_comment> selectByMasterId(int eId, int page_Num, int page_Size);

    /**
     * 根据员工id分页获取评论
     * @param empid 员工id
     * @param page_Num 页码
     * @param page_Size  每一页的大小
     * @return
     */
    PageInfo<T_comment> selectByEmployeeId(int empid, int page_Num, int page_Size);

    /**
     * 分页查询评论内容
     * @param page_Num 第几页
     * @param page_Size 每页的大小
     *
     * @return
     */
    PageInfo<T_comment> selectByPage(int page_Num, int page_Size);
    /**
     * 更新评论内容 ，可能不提供。
     * @param record 评论
     * @return
     */
    int updateByPrimaryKeySelective(T_comment record);
}
