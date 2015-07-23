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
@Service("empTypeServiceImp")
public class EmpTypeServiceImp implements EmpTypeService {
    @Resource
    private T_emptypeMapper t_emptypeMapper;

    /**
     * 锟斤拷删锟斤拷
     * @param tId 要删锟斤拷锟斤拷id
     * @return
     */
    public int deleteByPrimaryKey(Integer tId) {
        return t_emptypeMapper.deleteByPrimaryKey(tId);
    }
    /**
     * 锟斤拷锟�
     * @param record 业锟斤拷锟斤拷锟斤拷锟斤拷
     * @return 影锟斤拷锟斤拷锟斤拷
     */
    public int insert(T_emptype record) {
        return t_emptypeMapper.insert(record);
    }
    /**&
     * 锟斤拷樱锟斤拷萍锟绞癸拷茫锟�
     * @param record 业锟斤拷锟斤拷锟斤拷锟斤拷
     * @return 影锟斤拷锟斤拷锟斤拷
     */
    public int insertSelective(T_emptype record) {
        return t_emptypeMapper.insertSelective(record);
    }

    /**
     * 锟斤拷锟斤拷id 锟斤拷取业锟斤拷锟斤拷锟斤拷锟斤拷息
     * @param tId 业锟斤拷锟斤拷锟絠d
     * @return  业锟斤拷锟斤拷锟斤拷锟斤拷
     */
    public T_emptype selectByPrimaryKey(Integer tId) {
        return selectByPrimaryKey(tId);
    }
    /**
     * 锟斤拷锟斤拷业锟斤拷锟斤拷锟斤拷锟较� 锟斤拷锟狡硷拷使锟矫ｏ拷
     * @param record 要锟斤拷锟铰的讹拷锟斤拷
     * @return
     */
    public int updateByPrimaryKeySelective(T_emptype record) {
        return t_emptypeMapper.updateByPrimaryKeySelective(record);
    }
    /**
     * 要锟斤拷锟铰的讹拷锟斤拷
     * @param record
     * @return 影锟斤拷锟斤拷锟斤拷 一锟斤拷0
     */
    public int updateByPrimaryKey(T_emptype record) {
        return t_emptypeMapper.updateByPrimaryKey(record);
    }
    /**
     * 锟斤拷锟捷凤拷页锟斤拷取业锟斤拷锟斤拷息
     * @param pageNum 页锟斤拷
     * @param pageSize 每页锟斤拷小
     * @return 业锟斤拷锟絇ageInfo锟斤拷锟襟集猴拷
     */
    @Override
    public PageInfo<T_emptype> selectAll(int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T_emptype> list=t_emptypeMapper.selectAll();
        PageInfo<T_emptype> pageInfo=new PageInfo<T_emptype>(list);
        return pageInfo;
    }
}
