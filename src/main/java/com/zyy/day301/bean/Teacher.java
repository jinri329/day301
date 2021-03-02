package com.zyy.day301.bean;

import java.io.Serializable;

public class Teacher implements Serializable{
    private Integer id;
    private String tName;
    private int tLevel;
    private long phone;

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", tName='" + tName + '\'' +
                ", tLevel=" + tLevel +
                ", phone=" + phone +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String gettName() {
        return tName;
    }

    public void settName(String tName) {
        this.tName = tName;
    }

    public int gettLevel() {
        return tLevel;
    }

    public void settLevel(int tLevel) {
        this.tLevel = tLevel;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }
}
