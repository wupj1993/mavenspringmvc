/*
 * Copyright (c) 2015 / 7 / 22 11 :29 :47
 * BY:wupeiji
 * QQ:757671834
 *
 */

package com.wpj.swagger.controller;

import com.wpj.common.LogsTools;
import com.wpj.work.entity.BaseResult;

/**
 * -------------------------------------
 * Created by wupeji on 2015-07-22 23:29
 * ----------------------------------------
 **/
public class BaseController {
    /**
     * 用来输出日志
     */
protected LogsTools logsTools=new LogsTools(getClass());


    /**
     * @description: 构造成功返回结果
     * @param resultData  : 需要返回的数据，可选
     * @return
     */
    protected BaseResult buildSuccessResultInfo(Object resultData)
    {
        logsTools.debug(String.format("enter function, %s", resultData));
        BaseResult resultVo = new BaseResult();
        resultVo.setResultData(resultData);
        resultVo.setResultMessage("success");
        return  resultVo;
    }
    /**
     * @description: 构造失败返回结果
     * @param resultCode
     *            :任意非0数字，代表失败
     * @param failedMsg
     *            ：失败信息
     * @return
     */

    protected BaseResult buildFailedResultInfo(int resultCode, String failedMsg)
    {
        BaseResult resultVo = new BaseResult(resultCode, failedMsg);
        return resultVo;
    }
}
