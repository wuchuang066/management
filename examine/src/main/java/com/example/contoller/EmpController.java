package com.example.contoller;

import com.example.pojo.MgEmp;
import com.example.service.EmpService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("emp")
public class EmpController {
    //	  http://localhost:8083/emp/findAll
    @Autowired
    private EmpService empService;

    @RequestMapping("/addEmp")
    public Integer addEmp(MgEmp emp) {
            return this.empService.insert(emp);
    }

    @RequestMapping("findAll")
    public PageInfo<MgEmp> findAll(String empName,String empId,Integer pageNumber) {
        MgEmp emp = new MgEmp();
        if(empId!= null && !"".equals(empId)){
            emp.setEmpId(Integer.parseInt(empId));
        }
        if(pageNumber==null){
            pageNumber=1;
        }
        return this.empService.findEmpAndDept(emp, pageNumber);
    }

    @RequestMapping("/findByEmpid")
    public MgEmp findByEmpid(Integer id) {
        return this.empService.selectByPrimaryKey(id);
    }

    @RequestMapping("/updateByEmpid")
    public int updateByEmpid(MgEmp id) {
        return this.empService.updateByPrimaryKey(id);
    }

    @RequestMapping("/findByMgEmp")
    public MgEmp findByMgEmp(MgEmp emp) {
        MgEmp mgEmp = this.empService.findByMgEmp(emp);
        System.out.println(mgEmp);
        return mgEmp;
    }
    @RequestMapping("/deleteByEmpid")
    public int deleteByEmpid(Integer emp) {
        return this.empService.deleteByPrimaryKey(emp);
    }

    @RequestMapping("findAllEmpIdName")
    public List<MgEmp> findAllEmpIdName( Integer pageNumber) {
        List<MgEmp> mgEmps = this.empService.selectAll();
        System.out.println(mgEmps);
        return mgEmps;
    }
    @RequestMapping("findByCondition")
    public List<MgEmp> findByCondition(MgEmp mgEmp, Integer pageNumber) {
        if(mgEmp.getDeptName()!= null && !"".equals(mgEmp.getDeptName())){
            mgEmp.setEmpName("%"+mgEmp.getDeptName()+"%");
        }else{
            mgEmp.setEmpName("%%");
        }
        if(mgEmp.getEmpGrade()!= null && !"".equals(mgEmp.getEmpGrade())){
            mgEmp.setEmpId(Integer.parseInt(mgEmp.getEmpGrade()));
        }
        if(pageNumber==null){
            pageNumber=1;
        }
        List<MgEmp> mgEmps = this.empService.selectAll();
        System.out.println(mgEmps);
        return mgEmps;
    }

}
