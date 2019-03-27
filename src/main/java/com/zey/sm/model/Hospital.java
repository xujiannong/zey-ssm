package com.zey.sm.model;

import javax.persistence.Column;
import javax.persistence.Table;

@Table(name = "Hospital")
public class Hospital {
    @Column(name="name")
    private String name;

    @Column(name="id")
    private String id;

    @Column(name="deptType")
    private String deptType;

    @Column(name="deptGrade")
    private String deptGrade;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDeptType() {
        return deptType;
    }

    public void setDeptType(String deptType) {
        this.deptType = deptType;
    }

    public String getDeptGrade() {
        return deptGrade;
    }

    public void setDeptGrade(String deptGrade) {
        this.deptGrade = deptGrade;
    }



}
