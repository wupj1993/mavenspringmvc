package com.wpj.work;

import com.wpj.service.serviceImpl.CommentServiceImp;
import org.junit.Test;

import javax.annotation.Resource;
import java.util.Date;

/**
 * Created by Server on 2015/7/6.
 */
public class CommonTest extends TestFather {
    @Resource
    private CommentServiceImp commentServiceImp;
    @Test
    public void testOne(){
        System.out.println("---------------------------------------------->"+commentServiceImp);
      commentServiceImp.selectByPrimaryKey(1);
       commentServiceImp.deleteByPrimaryKey(1);
    }
    @Test
    public void insert(){
        commentServiceImp.insertSelective(new T_comment("11",1,new Date(),1));


    }
}
