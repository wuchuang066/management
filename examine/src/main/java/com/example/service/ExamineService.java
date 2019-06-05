package com.example.service;

import com.example.pojo.MgExamine;

import java.util.List;

public interface ExamineService {
    int deleteByPrimaryKey(Integer id);

    int insert(MgExamine record);

    MgExamine selectByPrimaryKey(Integer id);

    List<MgExamine> selectAll(Integer id);

    int updateByPrimaryKey(MgExamine record);

    Integer searchDate(Integer id);
}
