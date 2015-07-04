package com.wpj.work;

import com.wpj.work.dao.T_commentMapper;
import com.wpj.work.dao.T_orderMapper;
import com.wpj.work.entity.T_comment;
import com.wpj.work.entity.T_employees;
import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;
import java.util.Date;


/**
 * Created by Server on 2015/7/4.
 */
public class DaoTest extends TestFather {
    @Resource
    private T_commentMapper t_commentMapper;
    private static Logger log = Logger.getLogger(DaoTest.class);
    private final String TAG="DaoTest-------->";
//    @Before
//    public void prepare() throws Exception {
//
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("config/spring-mybatis.xml");
//
//        t_commentMapper = (T_commentMapper) ctx.getBean( "t_commentMapper" );
//        log.error("T_commentMapper--->" + t_commentMapper);
//    }
    @Test
    public void testOrder(){
      int res=  t_commentMapper.deleteByEmpKey(1);
        log.info(TAG+res);
    }
    @Test
    public void testdeleteByMasterKey(){
        t_commentMapper.deleteByMasterKey(1);
    }
    @Test
    public void testdeleteByPrimaryKey(){
        t_commentMapper.deleteByPrimaryKey(1);
    }
    @Test
    public void test(){
        T_comment t_comment=new T_comment();
        t_comment.seteId(1);
        t_comment.setcContent("test");
        t_comment.setcDatatime(new Date());
        t_comment.setEmpId(1);
        t_commentMapper.insert(t_comment);
    }
}
