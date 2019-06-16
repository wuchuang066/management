package com.zpark.mapper;

import com.zpark.pojo.XArea;

import java.util.List;

public interface XAreaMapperB {

    List<XArea> selectAll();

    List<Integer> selectParentId();

    List<XArea> selectByCondition(XArea xArea);

}