package com.zpark.pojo;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;
import java.util.Date;

public class XTableMsgB implements Serializable {
    private Integer id;
    @JsonProperty("date")
   // @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date xDate;
    @JsonProperty("name")
    private String xName;
    @JsonProperty("address")
    private String xAddress;

    private String xProvinceCode;

    private String xCityCode;

    private String xRegionCode;

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

    public String getxProvinceCode() {
        return xProvinceCode;
    }

    public void setxProvinceCode(String xProvinceCode) {
        this.xProvinceCode = xProvinceCode;
    }

    public String getxCityCode() {
        return xCityCode;
    }

    public void setxCityCode(String xCityCode) {
        this.xCityCode = xCityCode;
    }

    public String getxRegionCode() {
        return xRegionCode;
    }

    public void setxRegionCode(String xRegionCode) {
        this.xRegionCode = xRegionCode;
    }

    @Override
    public String toString() {
        return "XTableMsgB{" +
                "id=" + id +
                ", xDate=" + xDate +
                ", xName='" + xName + '\'' +
                ", xAddress='" + xAddress + '\'' +
                ", xProvinceCode='" + xProvinceCode + '\'' +
                ", xCityCode='" + xCityCode + '\'' +
                ", xRegionCode='" + xRegionCode + '\'' +
                ", sortMode='" + sortMode + '\'' +
                '}';
    }
}