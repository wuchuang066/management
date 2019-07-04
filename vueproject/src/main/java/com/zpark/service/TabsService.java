package com.zpark.service;

import com.zpark.pojo.XTabsAllMessage;
import com.zpark.pojo.XTabsMessage;

/**
 * @author wuc
 * @date 2019/7/2 15:52
 */
public interface TabsService {
    int deleteByPrimaryKey(Integer id);

    int insert(XTabsMessage record);

    XTabsMessage selectByPrimaryKey(Integer id);

    XTabsAllMessage selectAll();

    int updateByPrimaryKey(XTabsMessage record);

    int updateByCondition(XTabsMessage record);


}
