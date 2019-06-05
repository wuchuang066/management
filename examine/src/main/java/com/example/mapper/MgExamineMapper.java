package com.example.mapper;

import com.example.pojo.MgExamine;
import java.util.List;

public interface MgExamineMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MgExamine record);

    MgExamine selectByPrimaryKey(Integer id);

    List<MgExamine> selectAll(MgExamine record);

    int updateByPrimaryKey(MgExamine record);

    MgExamine searchDate(Integer record);
}