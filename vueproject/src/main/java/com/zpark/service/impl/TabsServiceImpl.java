package com.zpark.service.impl;

import com.zpark.mapper.XTabsMessageMapperB;
import com.zpark.pojo.XTabsAllMessage;
import com.zpark.pojo.XTabsMessage;
import com.zpark.service.TabsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author wuc
 * @date 2019/7/2 15:52
 */
@Service
public class TabsServiceImpl implements TabsService {

    @Autowired
    private XTabsMessageMapperB msgMapperB;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return 0;
    }

    @Override
    public int insert(XTabsMessage record) {
        return 0;
    }

    @Override
    public XTabsMessage selectByPrimaryKey(Integer id) {
        return null;
    }

    @Override
    public XTabsAllMessage selectAll() {
        XTabsAllMessage xTabsAllMessage = new XTabsAllMessage();
        xTabsAllMessage.setMessage("first");
        xTabsAllMessage.setShowHeader(false);
        XTabsMessage xTabsMessage = new XTabsMessage();
        xTabsMessage.setxStatus("1");
        List<XTabsMessage> xTabsMessagesUnread = this.msgMapperB.selectAllByCondition(xTabsMessage);
        xTabsAllMessage.setUnread(xTabsMessagesUnread);
        xTabsMessage.setxStatus("2");
        List<XTabsMessage> xTabsMessagesRead = this.msgMapperB.selectAllByCondition(xTabsMessage);
        xTabsAllMessage.setRead(xTabsMessagesRead);
        xTabsMessage.setxStatus("3");
        List<XTabsMessage> xTabsMessagesRecycle = this.msgMapperB.selectAllByCondition(xTabsMessage);
        xTabsAllMessage.setRecycle(xTabsMessagesRecycle);
        return xTabsAllMessage;


    }

    @Override
    public int updateByPrimaryKey(XTabsMessage record) {
        return 0;
    }
}
