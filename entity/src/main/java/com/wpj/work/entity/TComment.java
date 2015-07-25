package com.wpj.work.entity;

import java.util.Date;
import javax.persistence.*;

@Table(name = "t_comment")
public class TComment {
    /**
     * 评论id
     */
    @Id
    @Column(name = "c_id")
    private Integer cId;

    /**
     * 评论内容
     */
    @Column(name = "c_content")
    private String cContent;

    /**
     * 雇员id
     */
    @Column(name = "e__id")
    private Integer eId;

    /**
     * 评论时间
     */
    @Column(name = "c_datatime")
    private Date cDatatime;

    @Column(name = "c_isdelete")
    private Boolean cIsdelete;

    @Column(name = "emp_id")
    private Integer empId;

    /**
     * 获取评论id
     *
     * @return c_id - 评论id
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置评论id
     *
     * @param cId 评论id
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取评论内容
     *
     * @return c_content - 评论内容
     */
    public String getcContent() {
        return cContent;
    }

    /**
     * 设置评论内容
     *
     * @param cContent 评论内容
     */
    public void setcContent(String cContent) {
        this.cContent = cContent;
    }

    /**
     * 获取雇员id
     *
     * @return e__id - 雇员id
     */
    public Integer geteId() {
        return eId;
    }

    /**
     * 设置雇员id
     *
     * @param eId 雇员id
     */
    public void seteId(Integer eId) {
        this.eId = eId;
    }

    /**
     * 获取评论时间
     *
     * @return c_datatime - 评论时间
     */
    public Date getcDatatime() {
        return cDatatime;
    }

    /**
     * 设置评论时间
     *
     * @param cDatatime 评论时间
     */
    public void setcDatatime(Date cDatatime) {
        this.cDatatime = cDatatime;
    }

    /**
     * @return c_isdelete
     */
    public Boolean getcIsdelete() {
        return cIsdelete;
    }

    /**
     * @param cIsdelete
     */
    public void setcIsdelete(Boolean cIsdelete) {
        this.cIsdelete = cIsdelete;
    }

    /**
     * @return emp_id
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * @param empId
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }
}