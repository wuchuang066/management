package com.zpark.service.impl;

import com.zpark.mapper.XCustomerMapperB;
import com.zpark.pojo.XCustomer;
import com.zpark.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private XCustomerMapperB customerMapper;

    @Override
    public XCustomer queryUser(XCustomer customer) {
        XCustomer xCustomer = this.customerMapper.selectByCust(customer);
        if (xCustomer != null) {
            XCustomer xCustomerDate = new XCustomer();
            BeanUtils.copyProperties(xCustomer,xCustomerDate);
            xCustomerDate.setxUserid(xCustomer.getxUserid());
            xCustomerDate.setxLogindate(new Date());
            this.customerMapper.updateByPrimaryKey(xCustomerDate);
        }
        return xCustomer;
    }

    @Override
    public int deleteByPrimaryKey(Integer xUserid) {
        return 0;
    }

    @Override
    public int insert(XCustomer record) {
        return 0;
    }

    @Override
    public XCustomer selectByPrimaryKey(Integer xUserid) {
        return null;
    }

    @Override
    public List<XCustomer> selectAll() {
        return null;
    }

    @Override
    public int updateByPrimaryKey(XCustomer record) {
        return 0;
    }

    @Override
    public XCustomer selectByCust(XCustomer customer) {
        return null;
    }
}
