package com.zpark.service;

import com.zpark.pojo.Children;
import com.zpark.pojo.XArea;

import java.util.List;

public interface CommonService {

    int deleteByPrimaryKey(String areaId);

    int insert(XArea record);

    XArea selectByPrimaryKey(String areaId);

    List<Children> selectAll();

    int updateByPrimaryKey(XArea record);
}
