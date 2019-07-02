package com.zpark.mapper;

import com.zpark.pojo.XTabsMessage;

import java.util.List;

public interface XTabsMessageMapperB {
    int deleteByPrimaryKey(Integer id);

    int insert(XTabsMessage record);

    XTabsMessage selectByPrimaryKey(Integer id);

    List<XTabsMessage> selectAll();

    int updateByPrimaryKey(XTabsMessage record);

    List<XTabsMessage> selectAllByCondition(XTabsMessage record);
}