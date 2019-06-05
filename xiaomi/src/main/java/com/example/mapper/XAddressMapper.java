package com.example.mapper;

import com.example.pojo.XAddress;
import java.util.List;

public interface XAddressMapper {
    int deleteByPrimaryKey(Integer xUserid);

    int insert(XAddress record);

    XAddress selectByPrimaryKey(Integer xUserid);

    List<XAddress> selectAll();

    int updateByPrimaryKey(XAddress record);
}