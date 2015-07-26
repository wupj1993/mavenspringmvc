package com.wpj.work.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_order")
public class TOrder extends BaseDaomain{
    /**
     * 订单id
     */
    @Id
    @Column(name = "o_id")
    private String oId;

    /**
     * 订单开始时间
     */
    @Column(name = "o_starttime")
    private Date oStarttime;

    /**
     * 订单介绍
     */
    @Column(name = "o_introduce")
    private String oIntroduce;

    /**
     * 其他
     */
    @Column(name = "o_other")
    private String oOther;

    /**
     * 订单状态，外键
     */
    @Column(name = "o_status")
    private Integer oStatus;

    /**
     * 用户评价
     */
    @Column(name = "o_evaluation")
    private String oEvaluation;

    /**
     * 订单拥有者
     */
    @Column(name = "o_onwer")
    private Integer oOnwer;

    /**
     * 订单号
     */
    @Column(name = "o_number")
    private String oNumber;

    @Column(name = "o_isDelete")
    private Byte oIsdelete;

    /**
     * 获取订单id
     *
     * @return o_id - 订单id
     */
    public String getoId() {
        return oId;
    }

    /**
     * 设置订单id
     *
     * @param oId 订单id
     */
    public void setoId(String oId) {
        this.oId = oId;
    }

    /**
     * 获取订单开始时间
     *
     * @return o_starttime - 订单开始时间
     */
    public Date getoStarttime() {
        return oStarttime;
    }

    /**
     * 设置订单开始时间
     *
     * @param oStarttime 订单开始时间
     */
    public void setoStarttime(Date oStarttime) {
        this.oStarttime = oStarttime;
    }

    /**
     * 获取订单介绍
     *
     * @return o_introduce - 订单介绍
     */
    public String getoIntroduce() {
        return oIntroduce;
    }

    /**
     * 设置订单介绍
     *
     * @param oIntroduce 订单介绍
     */
    public void setoIntroduce(String oIntroduce) {
        this.oIntroduce = oIntroduce;
    }

    /**
     * 获取其他
     *
     * @return o_other - 其他
     */
    public String getoOther() {
        return oOther;
    }

    /**
     * 设置其他
     *
     * @param oOther 其他
     */
    public void setoOther(String oOther) {
        this.oOther = oOther;
    }

    /**
     * 获取订单状态，外键
     *
     * @return o_status - 订单状态，外键
     */
    public Integer getoStatus() {
        return oStatus;
    }

    /**
     * 设置订单状态，外键
     *
     * @param oStatus 订单状态，外键
     */
    public void setoStatus(Integer oStatus) {
        this.oStatus = oStatus;
    }

    /**
     * 获取用户评价
     *
     * @return o_evaluation - 用户评价
     */
    public String getoEvaluation() {
        return oEvaluation;
    }

    /**
     * 设置用户评价
     *
     * @param oEvaluation 用户评价
     */
    public void setoEvaluation(String oEvaluation) {
        this.oEvaluation = oEvaluation;
    }

    /**
     * 获取订单拥有者
     *
     * @return o_onwer - 订单拥有者
     */
    public Integer getoOnwer() {
        return oOnwer;
    }

    /**
     * 设置订单拥有者
     *
     * @param oOnwer 订单拥有者
     */
    public void setoOnwer(Integer oOnwer) {
        this.oOnwer = oOnwer;
    }

    /**
     * 获取订单号
     *
     * @return o_number - 订单号
     */
    public String getoNumber() {
        return oNumber;
    }

    /**
     * 设置订单号
     *
     * @param oNumber 订单号
     */
    public void setoNumber(String oNumber) {
        this.oNumber = oNumber;
    }

    /**
     * @return o_isDelete
     */
    public Byte getoIsdelete() {
        return oIsdelete;
    }

    /**
     * @param oIsdelete
     */
    public void setoIsdelete(Byte oIsdelete) {
        this.oIsdelete = oIsdelete;
    }

    @Override
    public String toString() {
        return "TOrder{" +
                "oId='" + oId + '\'' +
                ", oStarttime=" + oStarttime +
                ", oIntroduce='" + oIntroduce + '\'' +
                ", oOther='" + oOther + '\'' +
                ", oStatus=" + oStatus +
                ", oEvaluation='" + oEvaluation + '\'' +
                ", oOnwer=" + oOnwer +
                ", oNumber='" + oNumber + '\'' +
                ", oIsdelete=" + oIsdelete +
                '}';
    }
}