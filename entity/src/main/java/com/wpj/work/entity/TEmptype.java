package com.wpj.work.entity;

import javax.persistence.*;

@Table(name = "t_emptype")
public class TEmptype {
    /**
     * 类别id
     */
    @Id
    @Column(name = "t_id")
    private Integer tId;

    /**
     * 类别名字
     */
    @Column(name = "t_content")
    private String tContent;

    /**
     * 类别介绍
     */
    @Column(name = "t_introduce")
    private String tIntroduce;

    /**
     * 类别图片
     */
    @Column(name = "t_photoAdd")
    private String tPhotoadd;

    /**
     * 类别其他
     */
    @Column(name = "t_other")
    private String tOther;

    @Column(name = "t_isDelete")
    private Boolean tIsdelete;

    /**
     * 获取类别id
     *
     * @return t_id - 类别id
     */
    public Integer gettId() {
        return tId;
    }

    /**
     * 设置类别id
     *
     * @param tId 类别id
     */
    public void settId(Integer tId) {
        this.tId = tId;
    }

    /**
     * 获取类别名字
     *
     * @return t_content - 类别名字
     */
    public String gettContent() {
        return tContent;
    }

    /**
     * 设置类别名字
     *
     * @param tContent 类别名字
     */
    public void settContent(String tContent) {
        this.tContent = tContent;
    }

    /**
     * 获取类别介绍
     *
     * @return t_introduce - 类别介绍
     */
    public String gettIntroduce() {
        return tIntroduce;
    }

    /**
     * 设置类别介绍
     *
     * @param tIntroduce 类别介绍
     */
    public void settIntroduce(String tIntroduce) {
        this.tIntroduce = tIntroduce;
    }

    /**
     * 获取类别图片
     *
     * @return t_photoAdd - 类别图片
     */
    public String gettPhotoadd() {
        return tPhotoadd;
    }

    /**
     * 设置类别图片
     *
     * @param tPhotoadd 类别图片
     */
    public void settPhotoadd(String tPhotoadd) {
        this.tPhotoadd = tPhotoadd;
    }

    /**
     * 获取类别其他
     *
     * @return t_other - 类别其他
     */
    public String gettOther() {
        return tOther;
    }

    /**
     * 设置类别其他
     *
     * @param tOther 类别其他
     */
    public void settOther(String tOther) {
        this.tOther = tOther;
    }

    /**
     * @return t_isDelete
     */
    public Boolean gettIsdelete() {
        return tIsdelete;
    }

    /**
     * @param tIsdelete
     */
    public void settIsdelete(Boolean tIsdelete) {
        this.tIsdelete = tIsdelete;
    }
}