package com.wpj.work.entity;

import javax.persistence.*;

@Table(name = "t_orderstatus")
public class TOrderstatus extends BaseDaomain{
    /**
     * 状态id
     */
    @Id
    @Column(name = "s_id")
    private Integer sId;

    /**
     * 状态内容
     */
    @Column(name = "s_content")
    private String sContent;

    /**
     * 获取状态id
     *
     * @return s_id - 状态id
     */
    public Integer getsId() {
        return sId;
    }

    /**
     * 设置状态id
     *
     * @param sId 状态id
     */
    public void setsId(Integer sId) {
        this.sId = sId;
    }

    /**
     * 获取状态内容
     *
     * @return s_content - 状态内容
     */
    public String getsContent() {
        return sContent;
    }

    /**
     * 设置状态内容
     *
     * @param sContent 状态内容
     */
    public void setsContent(String sContent) {
        this.sContent = sContent;
    }

    @Override
    public String toString() {
        return "TOrderstatus{" +
                "sId=" + sId +
                ", sContent='" + sContent + '\'' +
                '}';
    }
}