package com.zpark.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Date;

public class XTableMsg {
    private Integer id;

    @JsonProperty("date")
    private Date xDate;
    @JsonProperty("name")
    private String xName;
    @JsonProperty("address")
    private String xAddress;

    private String sortMode;

    public String getSortMode() {
        return sortMode;
    }

    public void setSortMode(String sortMode) {
        this.sortMode = sortMode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getxDate() {
        return xDate;
    }

    public void setxDate(Date xDate) {
        this.xDate = xDate;
    }

    public String getxName() {
        return xName;
    }

    public void setxName(String xName) {
        this.xName = xName;
    }

    public String getxAddress() {
        return xAddress;
    }

    public void setxAddress(String xAddress) {
        this.xAddress = xAddress;
    }
}