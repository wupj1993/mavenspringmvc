/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.wpj.service.EmpTypeService;
import com.wpj.work.dao.T_emptypeMapper;
import com.wpj.work.entity.T_emptype;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by Server on 2015/5/30.
 */
@Service
public class EmpTypeServiceImp implements EmpTypeService {
    @Resource
    private T_emptypeMapper t_emptypeMapper;

    /**
     * 软删除
     * @param tId 要删除的id
     * @return
     */
    public int deleteByPrimaryKey(Integer tId) {
        return t_emptypeMapper.deleteByPrimaryKey(tId);
    }
    /**
     * 添加
     * @param record 业务类别对象
     * @return 影响行数
     */
    public int insert(T_emptype record) {
        return t_emptypeMapper.insert(record);
    }
    /**&
     * 添加（推荐使用）
     * @param record 业务类别对象
     * @return 影响行数
     */
    public int insertSelective(T_emptype record) {
        return t_emptypeMapper.insertSelective(record);
    }

    /**
     * 根据id 获取业务类别的信息
     * @param tId 业务类别id
     * @return  业务类别对象
     */
    public T_emptype selectByPrimaryKey(Integer tId) {
        return selectByPrimaryKey(tId);
    }
    /**
     * 更新业务类别信息 （推荐使用）
     * @param record 要更新的对象
     * @return
     */
    public int updateByPrimaryKeySelective(T_emptype record) {
        return t_emptypeMapper.updateByPrimaryKeySelective(record);
    }
    /**
     * 要更新的对象
     * @param record
     * @return 影响行数 一般0
     */
    public int updateByPrimaryKey(T_emptype record) {
        return t_emptypeMapper.updateByPrimaryKey(record);
    }
    /**
     * 根据分页获取业务信息
     * @param pageNum 页码
     * @param pageSize 每页大小
     * @return 业务的PageInfo对象集合
     */
    @Override
    public PageInfo<T_emptype> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T_emptype> list=t_emptypeMapper.selectAll();
        PageInfo<T_emptype> pageInfo=new PageInfo<T_emptype>(list);
        return pageInfo;
    }
}
