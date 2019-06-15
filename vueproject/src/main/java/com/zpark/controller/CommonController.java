package com.zpark.controller;

import com.zpark.pojo.Children;
import com.zpark.service.CommonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@ResponseBody
@RequestMapping("common")
public class CommonController {

    @Autowired
    private CommonService commonService;

    @GetMapping("queryProvince")
    public List<Children> queryProvince() {
        return this.commonService.selectAll();
    }
}
