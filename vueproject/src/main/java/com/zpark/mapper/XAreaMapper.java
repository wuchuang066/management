package com.zpark.mapper;

import com.zpark.pojo.XArea;
import java.util.List;

public interface XAreaMapper {
    int deleteByPrimaryKey(String areaId);

    int insert(XArea record);

    XArea selectByPrimaryKey(String areaId);

    List<XArea> selectAll();

    int updateByPrimaryKey(XArea record);
}