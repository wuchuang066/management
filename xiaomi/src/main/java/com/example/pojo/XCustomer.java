package com.example.pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class XCustomer {
    private Integer xUserid;

    private String xUsername;

    private String xUserpwd;

    private String xUsergrade;

    private String xStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date xCreatedate;

    private String xIsdelete;

    private String xDesc;

    private String xMobile;

    public Integer getxUserid() {
        return xUserid;
    }

    public void setxUserid(Integer xUserid) {
        this.xUserid = xUserid;
    }

    public String getxUsername() {
        return xUsername;
    }

    public void setxUsername(String xUsername) {
        this.xUsername = xUsername;
    }

    public String getxUserpwd() {
        return xUserpwd;
    }

    public void setxUserpwd(String xUserpwd) {
        this.xUserpwd = xUserpwd;
    }

    public String getxUsergrade() {
        return xUsergrade;
    }

    public void setxUsergrade(String xUsergrade) {
        this.xUsergrade = xUsergrade;
    }

    public String getxStatus() {
        return xStatus;
    }

    public void setxStatus(String xStatus) {
        this.xStatus = xStatus;
    }

    public Date getxCreatedate() {
        return xCreatedate;
    }

    public void setxCreatedate(Date xCreatedate) {
        this.xCreatedate = xCreatedate;
    }

    public String getxIsdelete() {
        return xIsdelete;
    }

    public void setxIsdelete(String xIsdelete) {
        this.xIsdelete = xIsdelete;
    }

    public String getxDesc() {
        return xDesc;
    }

    public void setxDesc(String xDesc) {
        this.xDesc = xDesc;
    }

    public String getxMobile() {
        return xMobile;
    }

    public void setxMobile(String xMobile) {
        this.xMobile = xMobile;
    }

    @Override
    public String toString() {
        return "XCustomer{" +
                "xUserid=" + xUserid +
                ", xUsername='" + xUsername + '\'' +
                ", xUserpwd='" + xUserpwd + '\'' +
                ", xUsergrade='" + xUsergrade + '\'' +
                ", xStatus='" + xStatus + '\'' +
                ", xCreatedate=" + xCreatedate +
                ", xIsdelete='" + xIsdelete + '\'' +
                ", xDesc='" + xDesc + '\'' +
                ", xMobile='" + xMobile + '\'' +
                '}';
    }
}