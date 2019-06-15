package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.XTableMsg;
import com.zpark.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="table")
@ResponseBody
public class TableController {
    @Autowired
    private TableService tableService;

    @RequestMapping(value = "queryTableMsg")
    public PageInfo<XTableMsg> queryTableMsg(XTableMsg xTableMsg,Integer pageNumber){
        return tableService.selectAll(xTableMsg,pageNumber);

    }
}
