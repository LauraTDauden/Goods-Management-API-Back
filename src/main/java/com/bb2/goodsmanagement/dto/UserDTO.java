package com.bb2.goodsmanagement.dto;

import com.bb2.goodsmanagement.domain.RoleEnum;

public class UserDTO {

    private long user_id;
    private String username;
    private String password;
    private RoleEnum role;

    public UserDTO() {
        this.user_id = 0;
        this.username = "";
        this.password = "";
        this.role = RoleEnum.MEMBER;
    }

    public long getUser_id() {
        return user_id;
    }

    public void setUser_id(long user_id) {
        this.user_id = user_id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleEnum getRole() {
        return role;
    }

    public void setRole(RoleEnum role) {
        this.role = role;
    }
}
