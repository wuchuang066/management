package com.zpark.mapper;

import com.zpark.pojo.XMessage;
import java.util.List;

public interface XMessageMapper {
    int deleteByPrimaryKey(Integer xUserid);

    int insert(XMessage record);

    XMessage selectByPrimaryKey(Integer xUserid);

    List<XMessage> selectAll();

    int updateByPrimaryKey(XMessage record);
}