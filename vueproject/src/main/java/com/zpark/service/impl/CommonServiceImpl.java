package com.zpark.service.impl;

import com.zpark.mapper.XAreaMapperB;
import com.zpark.pojo.Children;
import com.zpark.pojo.XArea;
import com.zpark.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private XAreaMapperB areaMapperB;

    @Override
    public int deleteByPrimaryKey(String areaId) {
        return 0;
    }

    @Override
    public int insert(XArea record) {
        return 0;
    }

    @Override
    public XArea selectByPrimaryKey(String areaId) {
        return null;
    }

    @Override
    @Cacheable(value = "provinceData")
    public List<Children> selectAll() {
        List<XArea> xAreas = areaMapperB.selectAll();
        System.out.println(xAreas);
        XArea xArea = new XArea();
        xArea.setAreaType("2");
        List<XArea> xAreas2 = areaMapperB.selectByCondition(xArea);
        xArea.setAreaType("3");
        List<XArea> xAreas3 = areaMapperB.selectByCondition(xArea);
        xArea.setAreaType("4");
        List<XArea> xAreas4 = areaMapperB.selectByCondition(xArea);
        List<Children> listChildren = new ArrayList<>();
        for (XArea xArea2 : xAreas2) {
            Children children2 = new Children();
            List<Children> listChildren2 = new ArrayList<>();
            for (XArea xArea3 : xAreas3) {
                Children children3 = new Children();
                List<Children> listChildren3 = new ArrayList<>();
                for (XArea xArea4 : xAreas4) {
                    // 将区添加到市（listChildren3）下面
                    if (xArea3.getAreaCode().equals(xArea4.getAreaParentId())) {
                        Children children4 = new Children();
                        children4.setLabel(xArea4.getAreaName());
                        children4.setValue(Integer.parseInt(xArea4.getAreaCode()));
                        listChildren3.add(children4);
                    }
                }
                // 如果没有区编码 则放入市编码
                if(listChildren3.size()==0){
                    Children children = new Children();
                    children.setLabel(xArea3.getAreaName());
                    children.setValue(Integer.parseInt(xArea3.getAreaCode()));
                    listChildren3.add(children);
                }
                if(xArea2.getAreaCode().equals(xArea3.getAreaParentId())) {
                    children3.setLabel(xArea3.getAreaName());
                    children3.setValue(Integer.parseInt(xArea3.getAreaCode()));
                    children3.setChildren(listChildren3);
                    listChildren2.add(children3);
                }
            }
            // 如果没有市编码 则放入省编码
            if(listChildren2.size()==0){
                Children children = new Children();
                children.setLabel(xArea2.getAreaName());
                children.setValue(Integer.parseInt(xArea2.getAreaCode()));
                listChildren2.add(children);
            }
            children2.setLabel(xArea2.getAreaName());
            children2.setValue(Integer.parseInt(xArea2.getAreaCode()));
            children2.setChildren(listChildren2);
            listChildren.add(children2);
        }
        System.out.println(listChildren);
        return listChildren;
    }

    @Override
    public int updateByPrimaryKey(XArea record) {
        return 0;
    }
}
