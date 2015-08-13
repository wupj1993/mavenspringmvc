/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.service.serviceImpl;


import com.wpj.service.OrderService;
import com.wpj.work.entity.T_order;
import org.springframework.stereotype.Service;

/**
 * Created by Server on 2015/5/30.
 */
@Service("orderServiceImp")
public class OrderServiceImp implements OrderService {
    public int deleteByPrimaryKey(String oId) {
        return 0;
    }

    public int insert(T_order record) {
        return 0;
    }

    public int insertSelective(T_order record) {
        return 0;
    }

    public T_order selectByPrimaryKey(String oId) {
        return null;
    }

    public int updateByPrimaryKeySelective(T_order record) {
        return 0;
    }

    public int updateByPrimaryKey(T_order record) {
        return 0;
    }
}
