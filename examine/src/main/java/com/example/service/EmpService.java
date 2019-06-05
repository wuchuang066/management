package com.example.service;

import com.example.pojo.MgEmp;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface EmpService {
	
	int deleteByPrimaryKey(Integer empId);

    int insert(MgEmp record);

    MgEmp selectByPrimaryKey(Integer empId);

    List<MgEmp> selectAll();

    int updateByPrimaryKey(MgEmp record);
	
    PageInfo<MgEmp> findEmpAndDept(MgEmp emp, Integer pageNumber);

    MgEmp findByMgEmp(MgEmp emp);

	

}
