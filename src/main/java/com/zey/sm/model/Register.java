package com.zey.sm.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name="mm")
public class Register {
    @Column(name="id")
    private int id;

    @Column(name="name")
    private  String name;

    @Column(name="username")
    private  String username;

    @Column(name="password")
    private  String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
}
