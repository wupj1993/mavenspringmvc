/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;


import com.wpj.service.MasterService;
import com.wpj.work.entity.T_masters;
import org.springframework.stereotype.Service;

/**
 * Created by Server on 2015/5/30.
 */
@Service("masterServiceImp")
public class MasterServiceImp implements MasterService {
    public int deleteByPrimaryKey(Integer eId) {
        return 0;
    }

    public int insert(T_masters record) {
        return 0;
    }

    public int insertSelective(T_masters record) {
        return 0;
    }

    public T_masters selectByPrimaryKey(Integer eId) {
        return null;
    }

    public int updateByPrimaryKeySelective(T_masters record) {
        return 0;
    }

    public int updateByPrimaryKey(T_masters record) {
        return 0;
    }
}
