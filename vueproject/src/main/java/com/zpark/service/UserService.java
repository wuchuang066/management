package com.zpark.service;

import com.zpark.pojo.XCustomer;

import java.util.List;

public interface UserService {
    XCustomer queryUser(XCustomer customer);

    int deleteByPrimaryKey(Integer xUserid);

    int insert(XCustomer record);

    XCustomer selectByPrimaryKey(Integer xUserid);

    List<XCustomer> selectAll();

    int updateByPrimaryKey(XCustomer record);

    XCustomer selectByCust(XCustomer customer);
}
