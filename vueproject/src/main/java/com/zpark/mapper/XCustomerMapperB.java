package com.zpark.mapper;

import com.zpark.pojo.XCustomer;

public interface XCustomerMapperB {

    int updateByPrimaryKey(XCustomer record);

    XCustomer selectByCust(XCustomer customer);
}