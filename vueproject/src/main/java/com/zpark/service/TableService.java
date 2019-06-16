package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.XTableMsgB;

public interface TableService {

    PageInfo<XTableMsgB> selectAll(XTableMsgB xTableMsg, Integer pageNumber);

    Integer updateTableMsg(XTableMsgB xTableMsg);

    Integer addTableMsg(XTableMsgB xTableMsg);

}
