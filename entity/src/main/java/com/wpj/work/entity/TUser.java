package com.wpj.work.entity;

import javax.persistence.*;

@Table(name = "t_user")
public class TUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_name")
    private String userName;

    @Column(name = "user_password")
    private String userPassword;

    @Column(name = "user_other")
    private String userOther;

    @Column(name = "user_role")
    private String userRole;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return user_name
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return user_password
     */
    public String getUserPassword() {
        return userPassword;
    }

    /**
     * @param userPassword
     */
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    /**
     * @return user_other
     */
    public String getUserOther() {
        return userOther;
    }

    /**
     * @param userOther
     */
    public void setUserOther(String userOther) {
        this.userOther = userOther;
    }

    /**
     * @return user_role
     */
    public String getUserRole() {
        return userRole;
    }

    /**
     * @param userRole
     */
    public void setUserRole(String userRole) {
        this.userRole = userRole;
    }
}