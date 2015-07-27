package com.wpj.work;

import com.wpj.service.impl.EmployeeServiceImpl;
import com.wpj.work.entity.TEmployees;
import org.junit.Test;

import javax.annotation.Resource;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/27.10:29
 * ****************************************************
 */
public class TestEmp extends TestFather {
    @Resource
    private EmployeeServiceImpl employeeService;
    @Test
    public void save(){
        TEmployees tEmployees=new TEmployees();
        tEmployees.seteId(123);
        tEmployees.seteAge(2);
        tEmployees.seteComments(2);
        tEmployees.seteType("ss");
        tEmployees.seteIntroduce(2);
        tEmployees.seteMvaddress("22");
        tEmployees.seteName("222");
        tEmployees.setePhone("2222");
        tEmployees.seteIsdelete(false);
        employeeService.save(tEmployees);
    }
}
