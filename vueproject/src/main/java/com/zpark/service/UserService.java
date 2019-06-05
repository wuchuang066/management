package com.zpark.service;

import com.zpark.pojo.XCustomer;
import org.springframework.stereotype.Service;


public interface UserService {
    XCustomer queryUser(XCustomer customer);
}
