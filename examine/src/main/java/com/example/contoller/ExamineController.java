package com.example.contoller;

import com.example.pojo.MgExamine;
import com.example.service.ExamineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("examine")
public class ExamineController {
    @Autowired
    private ExamineService examineService;

    @RequestMapping("/findByEmpid")
    public MgExamine findAll(Integer id) {
        return this.examineService.selectByPrimaryKey(id);
    }

    @RequestMapping("/updateByEmpid")
    public int updateByEmpid(MgExamine mgExamine) {
        return this.examineService.updateByPrimaryKey(mgExamine);
    }

    @RequestMapping("/insertByEmpid")
    public Integer insertByEmpid(MgExamine mgExamine) {
        return this.examineService.insert(mgExamine);
    }
    @RequestMapping("findAll")
    public List<MgExamine> findAllEmpIdName(Integer pageNumber,Integer empId) {
        List<MgExamine> mgExamines = this.examineService.selectAll(empId);
        return mgExamines;
    }
    @RequestMapping("searchDate")
    public Integer searchDate(Integer empId) {
        Integer mgExamine = this.examineService.searchDate(empId);
        return mgExamine;
    }

}
