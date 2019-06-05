package com.example.service.impl;

import com.example.mapper.MgEmpMapper;
import com.example.pojo.MgEmp;
import com.example.service.EmpService;
import com.example.util.PageUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service("empService")
public class EmpServiceImpl implements EmpService {

    @Autowired
    private MgEmpMapper empMapper;

    @Value("${web.upload-path}")
    private String path;

    @Override
    @Transactional
    public int deleteByPrimaryKey(Integer empId) {
        // TODO Auto-generated method stub
        return empMapper.deleteByPrimaryKey(empId);
    }

    @Override
    @Transactional
    public int insert(MgEmp record) {
        Integer deptId = record.getDeptId();
        if("1".equals(deptId.toString().substring(0,1))){
            record.setDeptName("管理部");
        }else{
            record.setDeptName("技术部");
        }
        record.setFilePath(path+record.getFilePath()+".jpg");
        return empMapper.insert(record);

    }

    @Override
    public MgEmp selectByPrimaryKey(Integer empId) {
        // TODO Auto-generated method stub
        return empMapper.selectByPrimaryKey(empId);
    }

    @Override
    public List<MgEmp> selectAll() {
        // TODO Auto-generated method stub
        return empMapper.selectAll();
    }

    @Override
    @Transactional
    public int updateByPrimaryKey(MgEmp record) {
        // TODO Auto-generated method stub
        return empMapper.updateByPrimaryKey(record);
    }

    /*mybatis 分页 插件+ 条件查询*/

    public PageInfo<MgEmp> findEmpAndDept(MgEmp emp, Integer pageNumber) {
        System.out.println(pageNumber);
        PageHelper.startPage(pageNumber, PageUtil.NOW_PAGE_SIZE);
        List<MgEmp> list = this.empMapper.findEmpAndDept(emp);
        System.out.println("empservice....list:" + list);
        return new PageInfo<>(list);
    }
    @Override
   public MgEmp findByMgEmp(MgEmp emp){
        return empMapper.selectByMgEmp(emp);
    }

}
