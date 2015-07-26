package com.wpj.service;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/23.20:44
 * ****************************************************
 */
@Service
public abstract class BaseService<T> {
    @Autowired
    protected Mapper<T> commonmapper;
    public int save(T entity){

        return commonmapper.insert(entity);
    }
    public int delete(T entity){
        return commonmapper.deleteByPrimaryKey(entity);
    }

    /**
     * 单表分页查询
     * @param pageNum
     * @param pageSize
     * @return
     */
    public List<T> seletePage(int pageNum,int pageSize){
        PageHelper.startPage(pageNum,pageSize);
        //spring4支持泛型注入
        return commonmapper.select(null);
    }
}
