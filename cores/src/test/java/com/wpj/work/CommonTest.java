package com.wpj.work;

import com.wpj.service.impl.*;
import com.wpj.work.entity.TComment;
import org.junit.Test;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * Created by Server on 2015/7/6.
 */
public class CommonTest extends TestFather {
    @Resource
    private CommentServiceImp commentService;
    @Resource
    private EmployeeServiceImpl employeeService;
    @Resource
    private EmpTypeServiceImpl empTypeService;
    @Resource
    private MasterServiceImpl masterService;
    @Resource
    private OrderServiceImpl orderService;
    @Resource
    private OrderStatusServiceImpl orderStatusService;
    @Resource
    private UserServiceImpl userService;
         @Test
        public void test(){

        System.out.println("----" + commentService);
             System.out.println("----" + employeeService);
             System.out.println("----" + empTypeService);
             System.out.println("----" + masterService);
             System.out.println("----" + orderService);
             System.out.println("----" + orderStatusService);
             System.out.println("----" + userService);
             List<TComment> list=commentService.seletePage(1, 5);
        System.out.println(list.toString());
    }
}
