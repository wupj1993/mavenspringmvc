/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpj.service.CommentService;
import com.wpj.work.dao.T_commentMapper;
import com.wpj.work.entity.Status;
import com.wpj.work.entity.T_comment;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 *评论
 */
@Service("commentServiceImp")
public class CommentServiceImp implements CommentService {
@Resource
private T_commentMapper t_commentMapper;
    private static Logger log = Logger.getLogger(CommentServiceImp.class);

    /**
     * 根据id删除评论
     * @param cId  要删除的id
     * @return 返回影响行数（1代表一行受影响，0代表不受影响）
     */
    public int deleteByPrimaryKey(Integer cId) {
        return t_commentMapper.deleteByPrimaryKey(cId);
    }
    /**
     * 根据雇主id 删除评论
     * @param cId 雇主id
     * @return 返回影响行数（1代表一行受影响，0代表不受影响）
     */
    @Override
    public int deleteByMasterKey(Integer cId) {
        return t_commentMapper.deleteByMasterKey(cId);
    }

    /**
     * 根据评论员工id删除
     * @param cId 员工id
     * @return 返回影响行数（1代表一行受影响，0代表不受影响）
     */
    @Override
    public int deleteByEmpKey(Integer cId) {
        return t_commentMapper.deleteByEmpKey(cId);
    }

    /**
     * 增加评论
     * @param record
     * @return
     */
    public int insert(T_comment record) {
        return t_commentMapper.insert(record);
    }

    /**
     * 增加评论
     * @param record
     * @return
     */
    public int insertSelective(T_comment record) {
        return t_commentMapper.insertSelective(record);
    }

    /**
     * 查询根据评论id
     * @param cId
     * @return
     */
    public T_comment selectByPrimaryKey(Integer cId) {
        return t_commentMapper.selectByPrimaryKey(cId);
    }

    /**
     * 根据雇主的id分页获取评论的集合
     * @param eId 雇主id
     * @param page_Num 页码
     * @param page_Size 每一页的大小
     * @return 评论的集合 获取方法 pageInfo.getList().get(0)
     */
    @Override
    public PageInfo<T_comment> selectByMasterId(int eId, int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectByMasterId(eId);
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        log.debug("分页的结果集合"+pageInfo);
        return pageInfo;
    }

    /**
     * 根据员工id分页获取评论
     * @param empid 员工id
     * @param page_Num 页码
     * @param page_Size  每一页的大小
     * @return 分页集合
     */
    @Override
    public PageInfo<T_comment> selectByEmployeeId(int empid, int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectByEmployeeId(empid);
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        log.debug("分页的结果集合"+pageInfo);
        return pageInfo;
    }

    /**
     *直接根据分页获取评论,默认获取未删除评论
     * @param page_Num 第几页
     * @param page_Size 每页的大小
     * @return
     */
    @Override
    public PageInfo<T_comment> selectByPage(int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectAll(1);
        System.out.println("--->"+list.size());
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        return pageInfo;
    }
    /**
     * 自定义查询的评论是否删除。
     * @param page_Num 页码
     * @param page_Size 每页大小
     * @param status 状态
     * @return
     */
    public PageInfo<T_comment> selectByPage(int page_Num, int page_Size,Status status) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_comment> list=t_commentMapper.selectAll(status.ordinal());
        System.out.println("--->"+list.size());
        PageInfo<T_comment> pageInfo=new PageInfo<T_comment>(list);
        return pageInfo;
    }


    /**
     *更新
     * @param record 评论
     * @return
     */
    public int updateByPrimaryKeySelective(T_comment record) {
        return 0;
    }

    public int updateByPrimaryKey(T_comment record) {
        return 0;
    }
}
