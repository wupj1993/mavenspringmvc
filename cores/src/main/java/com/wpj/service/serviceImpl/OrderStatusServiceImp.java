/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;


import com.wpj.service.OrderStatusService;
import com.wpj.work.entity.T_orderStatus;
import org.springframework.stereotype.Service;

/**
 * Created by Server on 2015/5/30.
 */
@Service("orderStatusServiceImp")
public class OrderStatusServiceImp implements OrderStatusService {
    public int deleteByPrimaryKey(Integer sId) {
        return 0;
    }

    public int insert(T_orderStatus record) {
        return 0;
    }

    public int insertSelective(T_orderStatus record) {
        return 0;
    }

    public T_orderStatus selectByPrimaryKey(Integer sId) {
        return null;
    }

    public int updateByPrimaryKeySelective(T_orderStatus record) {
        return 0;
    }

    public int updateByPrimaryKey(T_orderStatus record) {
        return 0;
    }
}
