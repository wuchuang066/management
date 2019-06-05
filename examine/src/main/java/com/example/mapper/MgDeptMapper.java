package com.example.mapper;

import com.example.pojo.MgDept;
import java.util.List;

public interface MgDeptMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MgDept record);

    MgDept selectByPrimaryKey(Integer id);

    List<MgDept> selectAll();

    int updateByPrimaryKey(MgDept record);
}