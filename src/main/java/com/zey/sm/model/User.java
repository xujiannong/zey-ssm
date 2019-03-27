package com.zey.sm.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "TB_USER")
public class User {

    private String id;

    private String username;

    private String password;

    private String email;

    private String phone;

    private String rolename;
    //角色名称 系统管理员、销售主管、客户经理、高管


    public String getId() {
        return id;
    }

    public User() {
        
    }

    public User(String username, String password, String email, String phone, String rolename) {
        super();
        this.username = username;
        this.password = password;
        this.email = email;
        this.phone = phone;
        this.rolename = rolename;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getRolename() {
        return rolename;
    }

    public void setRolename(String rolename) {
        this.rolename = rolename == null ? null : rolename.trim();
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", username=" + username + ", password=" + password + ", email=" + email + ", phone="
                + phone + ", rolename=" + rolename + "]";
    }

}
