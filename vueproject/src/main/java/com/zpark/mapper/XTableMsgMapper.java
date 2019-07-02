package com.zpark.mapper;

import com.zpark.pojo.XTableMsg;
import java.util.List;

public interface XTableMsgMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XTableMsg record);

    XTableMsg selectByPrimaryKey(Integer id);

    List<XTableMsg> selectAll();

    int updateByPrimaryKey(XTableMsg record);
}