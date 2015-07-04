package com.wpj.work.entity;

public class T_user  extends BaseDaomain {
    private Integer id;

    private String userName;

    private String userPassword;

    private String userOther;

    private String userRole;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword == null ? null : userPassword.trim();
    }

    public String getUserOther() {
        return userOther;
    }

    public void setUserOther(String userOther) {
        this.userOther = userOther == null ? null : userOther.trim();
    }

    public String getUserRole() {
        return userRole;
    }

    public void setUserRole(String userRole) {
        this.userRole = userRole == null ? null : userRole.trim();
    }

    @Override
    public String toString() {
        return "T_user{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", userOther='" + userOther + '\'' +
                ", userRole='" + userRole + '\'' +
                '}';
    }
}