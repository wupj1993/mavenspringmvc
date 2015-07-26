package com.wpj.service.impl;

import com.wpj.service.BaseService;
import com.wpj.service.EmployeeService;
import com.wpj.work.entity.TEmployees;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.common.Mapper;

import javax.annotation.Resource;
import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/26.21:56
 * ****************************************************
 */
@Service("employeeService")
public class EmployeeServiceImpl extends BaseService<TEmployees> implements EmployeeService {
    @Resource
    private Mapper<TEmployees> tEmployeesMapper;
    @Override
    public int save(TEmployees entity) {
        return super.save(entity);
    }

    @Override
    public int delete(TEmployees entity) {
        return super.delete(entity);
    }

    @Override
    public List<TEmployees> seletePage(int pageNum, int pageSize) {
        return super.seletePage(pageNum, pageSize);
    }
}
