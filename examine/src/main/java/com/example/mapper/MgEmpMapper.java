package com.example.mapper;

import com.example.pojo.MgEmp;

import java.util.List;

public interface MgEmpMapper {
    int deleteByPrimaryKey( Integer empId);

    int insert(MgEmp record);

    MgEmp selectByPrimaryKey( Integer empId);

    List<MgEmp> selectAll();

    int updateByPrimaryKey(MgEmp record);

    List<MgEmp> findEmpAndDept(MgEmp emp);

    MgEmp selectByMgEmp (MgEmp emp);

}