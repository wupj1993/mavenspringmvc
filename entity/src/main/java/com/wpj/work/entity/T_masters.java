/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;

/**
 * 雇主类
 */
public class T_masters   extends BaseDaomain{
    /**
     * 雇主id
     */
    private Integer eId;
    /**
     *雇主身份证号
     */
    private String empIdcard;
    /**
     *雇主名字
     */
    private String empName;
    /**
     *雇主联系方式
     */
    private String empPhone;
    /**
     *雇主登录密码
     */
    private String empPwd;
    /**
     *雇主其他信息
     */
    private String empOther;
    /**
     *雇主权限
     */
    private String empRole;
    /**
     *雇主备用电话
     */
    private String empPhonetwo;
    /**
     *是否删除
     */
    private int isDelete;

    public int getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(int isDelete) {
        this.isDelete = isDelete;
    }

    public Integer geteId() {
        return eId;
    }

    public void seteId(Integer eId) {
        this.eId = eId;
    }

    public String getEmpIdcard() {
        return empIdcard;
    }

    public void setEmpIdcard(String empIdcard) {
        this.empIdcard = empIdcard == null ? null : empIdcard.trim();
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName == null ? null : empName.trim();
    }

    public String getEmpPhone() {
        return empPhone;
    }

    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone == null ? null : empPhone.trim();
    }

    public String getEmpPwd() {
        return empPwd;
    }

    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd == null ? null : empPwd.trim();
    }

    public String getEmpOther() {
        return empOther;
    }

    public void setEmpOther(String empOther) {
        this.empOther = empOther == null ? null : empOther.trim();
    }

    public String getEmpRole() {
        return empRole;
    }

    public void setEmpRole(String empRole) {
        this.empRole = empRole == null ? null : empRole.trim();
    }

    public String getEmpPhonetwo() {
        return empPhonetwo;
    }

    public void setEmpPhonetwo(String empPhonetwo) {
        this.empPhonetwo = empPhonetwo == null ? null : empPhonetwo.trim();
    }

    @Override
    public String toString() {
        return "T_masters{" +
                "eId=" + eId +
                ", empIdcard='" + empIdcard + '\'' +
                ", empName='" + empName + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empPwd='" + empPwd + '\'' +
                ", empOther='" + empOther + '\'' +
                ", empRole='" + empRole + '\'' +
                ", empPhonetwo='" + empPhonetwo + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}