package com.example.service;

import com.example.pojo.XCustomer;

import java.util.List;

public interface UserService {

    int deleteByPrimaryKey(Integer xUserid);

    int insert(XCustomer record);

    XCustomer selectByPrimaryKey(Integer xUserid);

    List<XCustomer> selectAll();

    int updateByPrimaryKey(XCustomer record);

    XCustomer selectByCust(XCustomer xCustomer);

}
