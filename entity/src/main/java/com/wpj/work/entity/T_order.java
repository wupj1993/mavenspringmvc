/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;

import java.util.Date;

/**
 *订单
 *
 */
public class T_order  extends BaseDaomain {
    private String oId;
    /**
     *下单时间
     *
     */
    private Date oStarttime;
    /**
     *
     *订单介绍
     */
    private String oIntroduce;
    /**
     *
     *其他
     */
    private String oOther;
    /**
     *订单状态（状态表）
     *
     */
    private Integer oStatus;
    /**
     *订单评论
     *
     */
    private String oEvaluation;
    /**
     *订单拥有者
     *
     */
    private Integer oOnwer;
    /**
     *订单号
     *
     */
    private String oNumber;
    /**
     * 订单是否被删除 1未删除，0 删除
     */
    private int isDelete;

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public String getoId() {
        return oId;
    }

    public void setoId(String oId) {
        this.oId = oId == null ? null : oId.trim();
    }

    public Date getoStarttime() {
        return oStarttime;
    }

    public void setoStarttime(Date oStarttime) {
        this.oStarttime = oStarttime;
    }

    public String getoIntroduce() {
        return oIntroduce;
    }

    public void setoIntroduce(String oIntroduce) {
        this.oIntroduce = oIntroduce == null ? null : oIntroduce.trim();
    }

    public String getoOther() {
        return oOther;
    }

    public void setoOther(String oOther) {
        this.oOther = oOther == null ? null : oOther.trim();
    }

    public Integer getoStatus() {
        return oStatus;
    }

    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    public String getoEvaluation() {
        return oEvaluation;
    }

    public void setoEvaluation(String oEvaluation) {
        this.oEvaluation = oEvaluation == null ? null : oEvaluation.trim();
    }

    public Integer getoOnwer() {
        return oOnwer;
    }

    public void setoOnwer(Integer oOnwer) {
        this.oOnwer = oOnwer;
    }

    public String getoNumber() {
        return oNumber;
    }

    public void setoNumber(String oNumber) {
        this.oNumber = oNumber == null ? null : oNumber.trim();
    }
}