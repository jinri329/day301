package com.zyy.day301.vo;

import java.io.Serializable;

public class UserResult implements Serializable{
    private int status;
    private String msg;
    private boolean data;

    public UserResult(int status, String msg, boolean data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public UserResult() {
    }

    @Override
    public String toString() {
        return "StudentResult{" +
                "status=" + status +
                ", msg='" + msg + '\'' +
                ", data=" + data +
                '}';
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public boolean isData() {
        return data;
    }

    public void setData(boolean data) {
        this.data = data;
    }
}
