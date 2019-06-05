package com.example.controller;

import com.example.pojo.XCustomer;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("user")
public class UserController {
	
	@Autowired
	private UserService userService;

	@RequestMapping("/findByCust")
	public XCustomer findByCust(XCustomer customer){
		return this.userService.selectByCust(customer);
	}
	@RequestMapping("/insertCust")
	public Integer insertCust(XCustomer xCustomer){
		return this.userService.insert(xCustomer);
	}

	@RequestMapping("/testForm")
	private Integer testFrom(@RequestParam(value="fname",required = true)String name){
		System.out.println("name:"+name);
		return 0;
	}
}
