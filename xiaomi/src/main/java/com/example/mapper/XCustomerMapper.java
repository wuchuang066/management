package com.example.mapper;

import com.example.pojo.XCustomer;
import java.util.List;

public interface XCustomerMapper {
    int deleteByPrimaryKey(Integer xUserid);

    int insert(XCustomer record);

    XCustomer selectByPrimaryKey(Integer xUserid);

    List<XCustomer> selectAll();

    int updateByPrimaryKey(XCustomer record);

    XCustomer selectByCust(XCustomer xCustomer);
}