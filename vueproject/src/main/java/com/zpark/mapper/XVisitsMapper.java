package com.zpark.mapper;

import com.zpark.pojo.XVisits;
import java.util.List;

public interface XVisitsMapper {
    int insert(XVisits record);

    List<XVisits> selectAll();
}