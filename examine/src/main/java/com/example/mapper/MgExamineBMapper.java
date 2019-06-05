package com.example.mapper;

import com.example.pojo.MgExamineB;
import java.util.List;

public interface MgExamineBMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MgExamineB record);

    MgExamineB selectByPrimaryKey(Integer id);

    List<MgExamineB> selectAll();

    int updateByPrimaryKey(MgExamineB record);
}