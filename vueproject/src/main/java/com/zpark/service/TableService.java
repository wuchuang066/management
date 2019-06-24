package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.XTableMsgB;

import java.util.List;
import java.util.Map;

public interface TableService {

    PageInfo<XTableMsgB> selectAll(XTableMsgB xTableMsg, Integer pageNumber);

    Integer updateTableMsg(XTableMsgB xTableMsg);

    Integer addTableMsg(XTableMsgB xTableMsg);

    String queryJoinAddress(XTableMsgB xTableMsg);

    Integer handDelete(Map<String, List<Integer>> array);


}
