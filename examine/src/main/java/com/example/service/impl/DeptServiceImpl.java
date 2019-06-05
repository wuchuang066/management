package com.example.service.impl;

import com.example.mapper.MgDeptMapper;
import com.example.pojo.MgDept;
import com.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("deptService")
public class DeptServiceImpl implements DeptService {
	
	@Autowired
	private MgDeptMapper deptMapper;

	@Override
	public List<MgDept> selectAll() {
		// TODO Auto-generated method stub
		return deptMapper.selectAll();
	}

	@Override
	public MgDept selectByPrimaryKey(Integer deptId) {
		// TODO Auto-generated method stub
		return deptMapper.selectByPrimaryKey(deptId);
	}

}
