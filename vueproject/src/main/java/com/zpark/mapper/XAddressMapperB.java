package com.zpark.mapper;

import com.zpark.pojo.XAddress;

import java.util.List;

public interface XAddressMapperB {
    int deleteByPrimaryKey(Integer xUserid);

    int insert(XAddress record);

    XAddress selectByPrimaryKey(Integer xUserid);

    List<XAddress> selectAll();

    int updateByPrimaryKey(XAddress record);
}