package com.zpark.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpark.mapper.XAreaMapperB;
import com.zpark.mapper.XTableMsgMapperB;
import com.zpark.pojo.XArea;
import com.zpark.pojo.XTableMsgB;
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
    public PageInfo<XTableMsgB> selectAll(XTableMsgB xTableMsg, Integer pageNumber) {
        if (xTableMsg.getSortMode() == null) {
            xTableMsg.setSortMode("desc");
        }
        XArea xArea = new XArea();
        if (xTableMsg.getxAddress() != null) {
            xArea.setAreaCode(xTableMsg.getxAddress());
            List<XArea> xAreas = areaMapperB.selectByCondition(xArea);
            if (xAreas != null && xAreas.size() > 0) {
                xTableMsg.setxAddress(xAreas.get(0).getAreaName());
            }
        }
        PageHelper.startPage(pageNumber, 10);
        List<XTableMsgB> xTableMsgs = msgMapperB.selectAll(xTableMsg);
        return new PageInfo<>(xTableMsgs);
    }

    @Override
    public Integer updateTableMsg(XTableMsgB xTableMsg) {
        String provinceName = this.getAddress(xTableMsg.getxProvinceCode());
        String cityName = this.getAddress(xTableMsg.getxCityCode());
        String regionName = this.getAddress(xTableMsg.getxRegionCode());
        xTableMsg.setxAddress(provinceName + cityName + regionName);
        return msgMapperB.updateTableMsg(xTableMsg);
    }

    @Override
    public Integer addTableMsg(XTableMsgB xTableMsg) {
        String provinceName = this.getAddress(xTableMsg.getxProvinceCode());
        String cityName = this.getAddress(xTableMsg.getxCityCode());
        String regionName = this.getAddress(xTableMsg.getxRegionCode());
        xTableMsg.setxAddress(provinceName + cityName + regionName);
        return msgMapperB.addTableMsg(xTableMsg);
    }

    public String getAddress(String areaCode) {
        XArea xArea = new XArea();
        String address = "";
        if (areaCode != null) {
            xArea.setAreaCode(areaCode);
            List<XArea> xAreas = areaMapperB.selectByCondition(xArea);
            if (xAreas != null && xAreas.size() > 0) {
                address = xAreas.get(0).getAreaName();
            }
        }
        return address;
    }
}
