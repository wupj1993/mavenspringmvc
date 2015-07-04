/*
 * Copyright (c) 2015 -5 - 30  By wupeji QQ:757671834
 *
 */

package com.wpj.work.entity;

/**
 *员工实体
 */
public class T_employees extends BaseDaomain {
    private Integer eId;
    /**
     *员工名字
     */
    private String eName;
    /**
     *年龄
     */
    private Integer eAge;
    /**
     *员工简介
     */
    private String eIntroduce;
    /**
     *员工视频展示地址
     */
    private String eMvaddress;
    /**
     *员工联系方式
     */
    private String ePhone;
    /**
     *员工照片地址
     */
    private String ePhotoadd;
    /**
     *员工评论（评论实体类）
     * id
     */
    private Integer eComments;
    /**
     *员工工种
     */
    private String eType;

    /**
     *
     * @return
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

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName == null ? null : eName.trim();
    }

    public Integer geteAge() {
        return eAge;
    }

    public void seteAge(Integer eAge) {
        this.eAge = eAge;
    }

    public String geteIntroduce() {
        return eIntroduce;
    }

    public void seteIntroduce(String eIntroduce) {
        this.eIntroduce = eIntroduce;
    }

    public String geteMvaddress() {
        return eMvaddress;
    }

    public void seteMvaddress(String eMvaddress) {
        this.eMvaddress = eMvaddress == null ? null : eMvaddress.trim();
    }

    public String getePhone() {
        return ePhone;
    }

    public void setePhone(String ePhone) {
        this.ePhone = ePhone == null ? null : ePhone.trim();
    }

    public String getePhotoadd() {
        return ePhotoadd;
    }

    public void setePhotoadd(String ePhotoadd) {
        this.ePhotoadd = ePhotoadd == null ? null : ePhotoadd.trim();
    }

    public Integer geteComments() {
        return eComments;
    }

    public void seteComments(Integer eComments) {
        this.eComments = eComments;
    }

    public String geteType() {
        return eType;
    }

    public void seteType(String eType) {
        this.eType = eType == null ? null : eType.trim();
    }

    @Override
    public String toString() {
        return "T_employees{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eAge=" + eAge +
                ", eIntroduce='" + eIntroduce + '\'' +
                ", eMvaddress='" + eMvaddress + '\'' +
                ", ePhone='" + ePhone + '\'' +
                ", ePhotoadd='" + ePhotoadd + '\'' +
                ", eComments=" + eComments +
                ", eType='" + eType + '\'' +
                ", isDelete=" + isDelete +
                '}';
    }
}