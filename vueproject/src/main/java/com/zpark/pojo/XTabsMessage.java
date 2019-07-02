package com.zpark.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class XTabsMessage {

    private Integer id;

    @JsonProperty("title")
    private String xTitle;

    @JsonProperty("date")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date xDatetime;

    private String xStatus;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getxTitle() {
        return xTitle;
    }

    public void setxTitle(String xTitle) {
        this.xTitle = xTitle;
    }

    public Date getxDatetime() {
        return xDatetime;
    }

    public void setxDatetime(Date xDatetime) {
        this.xDatetime = xDatetime;
    }

    public String getxStatus() {
        return xStatus;
    }

    public void setxStatus(String xStatus) {
        this.xStatus = xStatus;
    }
}