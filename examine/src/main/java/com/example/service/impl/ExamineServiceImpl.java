package com.example.service.impl;

import com.example.mapper.MgExamineMapper;
import com.example.pojo.MgExamine;
import com.example.service.ExamineService;
import com.example.util.PageUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service("examineService")
public class ExamineServiceImpl implements ExamineService {


    @Autowired
    private MgExamineMapper mgExamineMapper;

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer id) {
        return mgExamineMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional
    public int insert(MgExamine record) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = sdf.format(new Date());
        record.setExamineDate(date);
        System.out.println(date);
        return mgExamineMapper.insert(record);
    }

    @Override
    public MgExamine selectByPrimaryKey(Integer id) {
        return mgExamineMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<MgExamine> selectAll(Integer id) {
        MgExamine mgExamine = new MgExamine();
        mgExamine.setEmpId(id);
        List<MgExamine> mgExamines = mgExamineMapper.selectAll(mgExamine);
        return mgExamines;
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(MgExamine record) {
        return mgExamineMapper.updateByPrimaryKey(record);
    }

    @Override
    public Integer searchDate(Integer record) {
        MgExamine mgExamine = mgExamineMapper.searchDate(record);
        int result = 1;
        if (mgExamine != null) {
            String date = mgExamine.getExamineDate();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            String date2 = sdf.format(new Date());
            int monthSpace = 0;
            try {
                monthSpace = PageUtil.getMonthSpace(date, date2);
            } catch (ParseException e) {
                e.printStackTrace();
            }
            System.out.println(monthSpace);
            result = monthSpace > 30 ? 1 : 0;
        }
        return result;


    }

}
