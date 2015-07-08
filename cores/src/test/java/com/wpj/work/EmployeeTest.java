/*
 * Copyright (c) 2015 - 7 - 8
 * ---7 :10:30
 * ---作者:吴培基
 * ---QQ:757671834
 */

package com.wpj.work;

import com.wpj.service.serviceImpl.EmployeesServiceImp;
import org.junit.Test;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/8.19:08
 * ****************************************************
 */
public class EmployeeTest extends TestFather{
    @Resource
    private EmployeesServiceImp employeesServiceImp;
    @Test
    public void testEmployee(){
        employeesServiceImp.deleteByPrimaryKey(1);
    }
}
