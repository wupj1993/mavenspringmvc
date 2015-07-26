/*
 * Copyright (c) 2015 / 7 / 23 0 :20 :28
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.swagger.controller;

import com.wordnik.swagger.annotations.Api;
import com.wordnik.swagger.annotations.ApiOperation;
import com.wordnik.swagger.annotations.ApiParam;
import com.wpj.work.entity.BaseResult;
import com.wpj.work.entity.TEmployees;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * -------------------------------------
 * Created by wupeji on 2015-07-23 00:20
 * ----------------------------------------
 **/
@Api(basePath = "/empTypes", value = "T_emptype", description = "工种信息的操作")
@RestController
@RequestMapping("/empTypes")
public class EmptypeController extends BaseController {
    @Resource
    private EmployeeServiceImpl empTypeServiceImp;

    @ResponseBody
    @RequestMapping(value = "/emptype", method = RequestMethod.POST)
    @ApiOperation(value = "addEmpType", notes = "新增工种信息", httpMethod = "POST", response = BaseResult.class)
    public BaseResult addEmpType(
            @ApiParam(required = true, name = "T_emptype", value = "工种实体")
            @RequestBody TEmployees t_emptype
    ) {
        logsTools.debug("工种信息：" + t_emptype.toString());
        BaseResult baseResult = null;
        if (t_emptype == null) {
            baseResult = buildFailedResultInfo(-1, "not allow empty");
        } else {
            int result = 1;//empTypeServiceImp.save(t_emptype);
            if (result > 0) {
                baseResult = buildSuccessResultInfo("success");
            } else {
                baseResult = buildFailedResultInfo(-1, "add faile");
            }
        }
        return baseResult;
    }


}
