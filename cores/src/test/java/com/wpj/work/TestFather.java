package com.wpj.work;/*
 * Copyright (c) 2015 /3 /29
 * 	      6 :22 : 11
 *               By: wupeiji
 *               Q  Q:757671834
 * 	      It is not easy to meet each other in such a big world
 */

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractTransactionalJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * Created by wpj on 2015/2/23.
 * 作者：吴培基
 * @see ：测试类的父类，每个测试都必须继承这个类否则无法获取数据。
 */
@RunWith(MySpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:config/spring-service.xml","classpath:entity_config/spring-mybatis.xml"})
@Transactional
@TransactionConfiguration(defaultRollback = true)
public class TestFather extends AbstractTransactionalJUnit4SpringContextTests {
    //加载数据源
    @Resource(name="dataSource")
    @Override
    public void setDataSource(DataSource dataSource) {
        super.setDataSource(dataSource);
    }
    @Test
    public void TestFather(){
        System.out.println("----------------------------------------------------------------");
    }
}
