package com.zpark.controller;

import com.zpark.pojo.XCustomer;
import com.zpark.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@ResponseBody
@RequestMapping("user")
public class UserController {
    @Autowired
    private UserService userService;

    @PostMapping("login")
    public XCustomer login(String uname, String upwd) {
        XCustomer user = new XCustomer();
        user.setxUsername(uname);
        user.setxUserpwd(upwd);
        System.out.println(user);
        return this.userService.queryUser(user);
    }
}
