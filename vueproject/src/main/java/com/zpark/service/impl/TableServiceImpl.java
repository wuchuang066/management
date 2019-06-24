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
import java.util.Map;

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
        String address = this.joinAddress(xTableMsg);
        xTableMsg.setxAddress(address);
        return msgMapperB.updateTableMsg(xTableMsg);
    }

    @Override
    public Integer addTableMsg(XTableMsgB xTableMsg) {
        String address = this.joinAddress(xTableMsg);
        xTableMsg.setxAddress(address);
        return msgMapperB.addTableMsg(xTableMsg);
    }

    /**
     * 功能描述
     * @author wuc
     * @date 2019/6/17
     * @param xTableMsg
     * @return java.lang.String
     */
    @Override
    public String queryJoinAddress(XTableMsgB xTableMsg) {
        String s = this.joinAddress(xTableMsg);
        System.out.println(s);
        return s;
    }

    @Override
    public Integer handDelete(Map<String, List<Integer>> array) {
        List<Integer> keys = array.get("array");
        return this.msgMapperB.deleteByPrimaryKey(keys);
    }

    /**
     * 功能描述
     *
     * @param areaCode
     * @return java.lang.String
     * @author wuc
     * @date 2019/6/17
     */
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

    /**
     * 功能描述
     * @author wuc
     * @date 2019/6/17
     * @param xTableMsgb
     * @return java.lang.String
     */
    public String joinAddress(XTableMsgB xTableMsgb) {
        String provinceName = this.getAddress(xTableMsgb.getxProvinceCode());
        String cityName = this.getAddress(xTableMsgb.getxCityCode());
        String regionName = this.getAddress(xTableMsgb.getxRegionCode());
        return provinceName + cityName + regionName;
    }
}
