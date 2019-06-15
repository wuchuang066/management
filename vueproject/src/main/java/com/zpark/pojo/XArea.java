package com.zpark.pojo;

import java.io.Serializable;

public class XArea implements Serializable {
    private String areaId;

    private String areaCode;

    private String areaName;

    private String areaParentId;

    private String areaType;

    private String areaDesc;

    public String getAreaId() {
        return areaId;
    }

    public void setAreaId(String areaId) {
        this.areaId = areaId;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public String getAreaParentId() {
        return areaParentId;
    }

    public void setAreaParentId(String areaParentId) {
        this.areaParentId = areaParentId;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public String getAreaDesc() {
        return areaDesc;
    }

    public void setAreaDesc(String areaDesc) {
        this.areaDesc = areaDesc;
    }

    @Override
    public String toString() {
        return "XArea{" +
                "areaId='" + areaId + '\'' +
                ", areaCode='" + areaCode + '\'' +
                ", areaName='" + areaName + '\'' +
                ", areaParentId='" + areaParentId + '\'' +
                ", areaType='" + areaType + '\'' +
                ", areaDesc='" + areaDesc + '\'' +
                '}';
    }
}