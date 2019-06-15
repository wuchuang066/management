package com.zpark.service;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.XTableMsg;

public interface TableService {

    PageInfo<XTableMsg> selectAll(XTableMsg xTableMsg,Integer pageNumber);

}
