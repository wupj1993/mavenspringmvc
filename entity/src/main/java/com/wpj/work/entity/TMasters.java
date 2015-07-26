package com.wpj.work.entity;

import javax.persistence.*;

@Table(name = "t_masters")
public class TMasters extends BaseDaomain {
    /**
     * 雇主id
     */
    @Id
    @Column(name = "e_id")
    private Integer eId;

    /**
     * 身份证
     */
    @Column(name = "emp_idcard")
    private String empIdcard;

    /**
     * 雇主姓名
     */
    @Column(name = "emp_name")
    private String empName;

    /**
     * 雇主联系方式
     */
    @Column(name = "emp_phone")
    private String empPhone;

    /**
     * 雇主登录密码
     */
    @Column(name = "emp_pwd")
    private String empPwd;

    /**
     * 其他
     */
    @Column(name = "emp_other")
    private String empOther;

    @Column(name = "emp_role")
    private String empRole;

    /**
     * 备用联系方式
     */
    @Column(name = "emp_phonetwo")
    private String empPhonetwo;

    @Column(name = "emp_isDelete")
    private Boolean empIsdelete;

    /**
     * 获取雇主id
     *
     * @return e_id - 雇主id
     */
    public Integer geteId() {
        return eId;
    }

    /**
     * 设置雇主id
     *
     * @param eId 雇主id
     */
    public void seteId(Integer eId) {
        this.eId = eId;
    }

    /**
     * 获取身份证
     *
     * @return emp_idcard - 身份证
     */
    public String getEmpIdcard() {
        return empIdcard;
    }

    /**
     * 设置身份证
     *
     * @param empIdcard 身份证
     */
    public void setEmpIdcard(String empIdcard) {
        this.empIdcard = empIdcard;
    }

    /**
     * 获取雇主姓名
     *
     * @return emp_name - 雇主姓名
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * 设置雇主姓名
     *
     * @param empName 雇主姓名
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    /**
     * 获取雇主联系方式
     *
     * @return emp_phone - 雇主联系方式
     */
    public String getEmpPhone() {
        return empPhone;
    }

    /**
     * 设置雇主联系方式
     *
     * @param empPhone 雇主联系方式
     */
    public void setEmpPhone(String empPhone) {
        this.empPhone = empPhone;
    }

    /**
     * 获取雇主登录密码
     *
     * @return emp_pwd - 雇主登录密码
     */
    public String getEmpPwd() {
        return empPwd;
    }

    /**
     * 设置雇主登录密码
     *
     * @param empPwd 雇主登录密码
     */
    public void setEmpPwd(String empPwd) {
        this.empPwd = empPwd;
    }

    /**
     * 获取其他
     *
     * @return emp_other - 其他
     */
    public String getEmpOther() {
        return empOther;
    }

    /**
     * 设置其他
     *
     * @param empOther 其他
     */
    public void setEmpOther(String empOther) {
        this.empOther = empOther;
    }

    /**
     * @return emp_role
     */
    public String getEmpRole() {
        return empRole;
    }

    /**
     * @param empRole
     */
    public void setEmpRole(String empRole) {
        this.empRole = empRole;
    }

    /**
     * 获取备用联系方式
     *
     * @return emp_phonetwo - 备用联系方式
     */
    public String getEmpPhonetwo() {
        return empPhonetwo;
    }

    /**
     * 设置备用联系方式
     *
     * @param empPhonetwo 备用联系方式
     */
    public void setEmpPhonetwo(String empPhonetwo) {
        this.empPhonetwo = empPhonetwo;
    }

    /**
     * @return emp_isDelete
     */
    public Boolean getEmpIsdelete() {
        return empIsdelete;
    }

    /**
     * @param empIsdelete
     */
    public void setEmpIsdelete(Boolean empIsdelete) {
        this.empIsdelete = empIsdelete;
    }

    @Override
    public String toString() {
        return "TMasters{" +
                "eId=" + eId +
                ", empIdcard='" + empIdcard + '\'' +
                ", empName='" + empName + '\'' +
                ", empPhone='" + empPhone + '\'' +
                ", empPwd='" + empPwd + '\'' +
                ", empOther='" + empOther + '\'' +
                ", empRole='" + empRole + '\'' +
                ", empPhonetwo='" + empPhonetwo + '\'' +
                ", empIsdelete=" + empIsdelete +
                '}';
    }
}