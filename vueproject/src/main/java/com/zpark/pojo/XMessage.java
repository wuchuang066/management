package com.zpark.pojo;

import java.util.List;

public class XMessage {
    private Integer xUserid;

    private Float xVue;

    private Float xJs;

    private Float xCss;

    private Float xHtml;

    private Integer xVisitCount;

    private Integer xSysMessage;

    private Integer xCount;

    private List<XVisits> xVisits;

    public List<XVisits> getxVisits() {
        return xVisits;
    }

    public void setxVisits(List<XVisits> xVisits) {
        this.xVisits = xVisits;
    }

    public Integer getxUserid() {
        return xUserid;
    }

    public void setxUserid(Integer xUserid) {
        this.xUserid = xUserid;
    }

    public Float getxVue() {
        return xVue;
    }

    public void setxVue(Float xVue) {
        this.xVue = xVue;
    }

    public Float getxJs() {
        return xJs;
    }

    public void setxJs(Float xJs) {
        this.xJs = xJs;
    }

    public Float getxCss() {
        return xCss;
    }

    public void setxCss(Float xCss) {
        this.xCss = xCss;
    }

    public Float getxHtml() {
        return xHtml;
    }

    public void setxHtml(Float xHtml) {
        this.xHtml = xHtml;
    }

    public Integer getxVisitCount() {
        return xVisitCount;
    }

    public void setxVisitCount(Integer xVisitCount) {
        this.xVisitCount = xVisitCount;
    }

    public Integer getxSysMessage() {
        return xSysMessage;
    }

    public void setxSysMessage(Integer xSysMessage) {
        this.xSysMessage = xSysMessage;
    }

    public Integer getxCount() {
        return xCount;
    }

    public void setxCount(Integer xCount) {
        this.xCount = xCount;
    }
}