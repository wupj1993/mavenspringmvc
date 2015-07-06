/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpj.service.EmployeesService;
import com.wpj.work.dao.T_employeesMapper;
import com.wpj.work.entity.T_comment;
import com.wpj.work.entity.T_employees;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Server on 2015/5/30.
 * 员工
 */
@Service
public class EmployeesServiceImp implements EmployeesService {
    @Resource
    private T_employeesMapper t_employeesMapper;
    @Resource
    private CommentServiceImp commentServiceImp;
    private static org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger(EmployeesServiceImp.class);
    private static String TAG="EmployeesServiceImp";
    public int deleteByPrimaryKey(Integer eId) {
        return t_employeesMapper.deleteByPrimaryKey(eId);
    }

    /**
     * 根据员工id获取员工的评论
     * @param id
     * @return 评论信息的集合
     */
    @Override
  public PageInfo<T_comment> selectCommentByEmployeeId(int id,int pageNum,int pageSize) {
        return commentServiceImp.selectByEmployeeId(id,pageNum,pageSize);
    }

    /**
     * 添加员工信息
     * @param record 员工信息
     * @return 影响行数
     */
    public int insert(T_employees record) {
        return t_employeesMapper.insertSelective(record);
    }

    /**
     * 根据分页查询员工信息
     * @param page_Num 页码
     * @param page_Size 每页大小
     * @return 员工信息集合
     */
    @Override
    public PageInfo<T_employees> selectEmployee(int page_Num, int page_Size) {
        PageHelper.startPage(page_Num, page_Size);
        List<T_employees> list=t_employeesMapper.selectAllByPage();
        PageInfo<T_employees> pageInfo=new PageInfo<T_employees>(list);
        log.debug(TAG+pageInfo);
        return pageInfo;

    }

    /**
     * 添加员工信息
     * @param record 员工信息
     * @return 影响行数
     */
    public int insertSelective(T_employees record) {

        return t_employeesMapper.insertSelective(record);
    }

    /**
     * 根据员工id获取员工信息
     * @param eId
     * @return 员工信息实体类
     */
    public T_employees selectByPrimaryKey(Integer eId) {
        return t_employeesMapper.selectByPrimaryKey(eId);
    }

    /**
     * 根据id更新员工信息
     * @param record 员工信息
     * @return 影响行数
     */
    public int updateByPrimaryKeySelective(T_employees record) {
        return t_employeesMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 根据id更新员工信息
     * @param record 员工实体类
      * @return 影响行数
     */
    public int updateByPrimaryKey(T_employees record) {
        return t_employeesMapper.updateByPrimaryKey(record);
    }
}
