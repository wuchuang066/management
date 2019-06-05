package com.example.contoller;

import com.example.pojo.MgDept;
import com.example.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("dept")   //  localhost:8082/dept/findAllDept
public class DeptController {
	
	@Autowired
	private DeptService deptService;
	
	@RequestMapping("/findAllDept")
	public List<MgDept> findAllDept(){
		return this.deptService.selectAll();
	}

}
