package com.example.service;

import com.example.pojo.MgDept;

import java.util.List;

public interface DeptService {
	
	  List<MgDept> selectAll();
	  
	  MgDept selectByPrimaryKey(Integer deptId);

}
