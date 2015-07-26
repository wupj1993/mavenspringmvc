package com.wpj.work.entity;

import javax.persistence.*;

@Table(name = "t_employees")
public class TEmployees extends BaseDaomain {
    @Id
    @Column(name = "e_id")
    private Integer eId;

    @Column(name = "e_name")
    private String eName;

    /**
     * 年龄
     */
    @Column(name = "e_age")
    private Integer eAge;

    /**
     * 介绍
     */
    @Column(name = "e_introduce")
    private Integer eIntroduce;

    /**
     * 服务评级(现为积分)
     */
    @Column(name = "e_mvaddress")
    private String eMvaddress;

    @Column(name = "e_phone")
    private String ePhone;

    @Column(name = "e_photoadd")
    private String ePhotoadd;

    /**
     * 评论表（外键）
     */
    @Column(name = "e_comments")
    private Integer eComments;

    /**
     * 员工类别（工种）
     */
    @Column(name = "e_type")
    private String eType;

    /**
     * 1未删除
     */
    @Column(name = "e_isDelete")
    private Boolean eIsdelete;

    /**
     * @return e_id
     */
    public Integer geteId() {
        return eId;
    }

    /**
     * @param eId
     */
    public void seteId(Integer eId) {
        this.eId = eId;
    }

    /**
     * @return e_name
     */
    public String geteName() {
        return eName;
    }

    /**
     * @param eName
     */
    public void seteName(String eName) {
        this.eName = eName;
    }

    /**
     * 获取年龄
     *
     * @return e_age - 年龄
     */
    public Integer geteAge() {
        return eAge;
    }

    /**
     * 设置年龄
     *
     * @param eAge 年龄
     */
    public void seteAge(Integer eAge) {
        this.eAge = eAge;
    }

    /**
     * 获取介绍
     *
     * @return e_introduce - 介绍
     */
    public Integer geteIntroduce() {
        return eIntroduce;
    }

    /**
     * 设置介绍
     *
     * @param eIntroduce 介绍
     */
    public void seteIntroduce(Integer eIntroduce) {
        this.eIntroduce = eIntroduce;
    }

    /**
     * 获取服务评级(现为积分)
     *
     * @return e_mvaddress - 服务评级(现为积分)
     */
    public String geteMvaddress() {
        return eMvaddress;
    }

    /**
     * 设置服务评级(现为积分)
     *
     * @param eMvaddress 服务评级(现为积分)
     */
    public void seteMvaddress(String eMvaddress) {
        this.eMvaddress = eMvaddress;
    }

    /**
     * @return e_phone
     */
    public String getePhone() {
        return ePhone;
    }

    /**
     * @param ePhone
     */
    public void setePhone(String ePhone) {
        this.ePhone = ePhone;
    }

    /**
     * @return e_photoadd
     */
    public String getePhotoadd() {
        return ePhotoadd;
    }

    /**
     * @param ePhotoadd
     */
    public void setePhotoadd(String ePhotoadd) {
        this.ePhotoadd = ePhotoadd;
    }

    /**
     * 获取评论表（外键）
     *
     * @return e_comments - 评论表（外键）
     */
    public Integer geteComments() {
        return eComments;
    }

    /**
     * 设置评论表（外键）
     *
     * @param eComments 评论表（外键）
     */
    public void seteComments(Integer eComments) {
        this.eComments = eComments;
    }

    /**
     * 获取员工类别（工种）
     *
     * @return e_type - 员工类别（工种）
     */
    public String geteType() {
        return eType;
    }

    /**
     * 设置员工类别（工种）
     *
     * @param eType 员工类别（工种）
     */
    public void seteType(String eType) {
        this.eType = eType;
    }

    /**
     * 获取1未删除
     *
     * @return e_isDelete - 1未删除
     */
    public Boolean geteIsdelete() {
        return eIsdelete;
    }

    /**
     * 设置1未删除
     *
     * @param eIsdelete 1未删除
     */
    public void seteIsdelete(Boolean eIsdelete) {
        this.eIsdelete = eIsdelete;
    }

    @Override
    public String toString() {
        return "TEmployees{" +
                "eId=" + eId +
                ", eName='" + eName + '\'' +
                ", eAge=" + eAge +
                ", eIntroduce=" + eIntroduce +
                ", eMvaddress='" + eMvaddress + '\'' +
                ", ePhone='" + ePhone + '\'' +
                ", ePhotoadd='" + ePhotoadd + '\'' +
                ", eComments=" + eComments +
                ", eType='" + eType + '\'' +
                ", eIsdelete=" + eIsdelete +
                '}';
    }
}