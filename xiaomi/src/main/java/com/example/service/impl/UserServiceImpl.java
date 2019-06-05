package com.example.service.impl;

import com.example.mapper.XCustomerMapper;
import com.example.pojo.XCustomer;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Autowired
	private XCustomerMapper customerMapper;

	@Override
	@Transactional
	public int deleteByPrimaryKey(Integer xUserid) {
		return customerMapper.deleteByPrimaryKey(xUserid);
	}

	@Override
	@Transactional
	public int insert(XCustomer record) {
		Date date = new Date();
		record.setxCreatedate(date);
		record.setxStatus("1");
		record.setxIsdelete("0");
		return customerMapper.insert(record);
	}

	@Override
	public XCustomer selectByPrimaryKey(Integer xUserid) {
		return customerMapper.selectByPrimaryKey(xUserid);
	}

	@Override
	public List<XCustomer> selectAll() {
		return customerMapper.selectAll();
	}

	@Override
	@Transactional
	public int updateByPrimaryKey(XCustomer record) {
		return customerMapper.updateByPrimaryKey(record);
	}

	@Override
	public XCustomer selectByCust(XCustomer xCustomer) {

		return customerMapper.selectByCust(xCustomer);
	}
}
