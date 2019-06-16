package com.zpark.mapper;

import com.zpark.pojo.XTableMsgB;

import java.util.List;

public interface XTableMsgMapperB {

    List<XTableMsgB> selectAll(XTableMsgB xTableMsg);

    Integer updateTableMsg(XTableMsgB xTableMsg);

    Integer addTableMsg(XTableMsgB xTableMsg);

}