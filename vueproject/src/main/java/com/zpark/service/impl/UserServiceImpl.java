package com.zpark.service.impl;

import com.zpark.mapper.XCustomerMapper;
import com.zpark.pojo.XCustomer;
import com.zpark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private XCustomerMapper customerMapper;
    @Override
    public XCustomer queryUser(XCustomer customer) {
        return this.customerMapper.selectByCust(customer);
    }
}
