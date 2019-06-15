package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.XAreaMapperB;
import com.zpark.mapper.XTableMsgMapperB;
import com.zpark.pojo.XArea;
import com.zpark.pojo.XTableMsg;
import com.zpark.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TableServiceImpl implements TableService {

    @Autowired
    private XTableMsgMapperB msgMapperB;

    @Autowired
    private XAreaMapperB areaMapperB;

    @Override
    public PageInfo<XTableMsg> selectAll(XTableMsg xTableMsg,Integer pageNumber) {
        if(xTableMsg.getSortMode()==null) {
            xTableMsg.setSortMode("desc");
        }
        XArea xArea= new XArea();
        xArea.setAreaCode(xTableMsg.getxAddress());
        List<XArea> xAreas = areaMapperB.selectByCondition(xArea);
        if(xAreas!=null && xAreas.size()>0){
            xTableMsg.setxAddress(xAreas.get(0).getAreaName());
        }
        PageHelper.startPage(pageNumber, 10);
        List<XTableMsg> xTableMsgs = msgMapperB.selectAll(xTableMsg);
        return  new PageInfo<>(xTableMsgs);
    }
}
