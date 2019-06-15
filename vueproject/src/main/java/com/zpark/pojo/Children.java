package com.zpark.pojo;

import java.io.Serializable;
import java.util.List;

public class Children implements Serializable {
    private Integer value;
    private String label;
    private List<Children> children;

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public List<Children> getChildren() {
        return children;
    }

    public void setChildren(List<Children> children) {
        this.children = children;
    }
}
