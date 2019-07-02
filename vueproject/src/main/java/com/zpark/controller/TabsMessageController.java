package com.zpark.controller;

import com.zpark.pojo.XTabsAllMessage;
import com.zpark.service.TabsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wuc
 * @date 2019/7/2 15:48
 */
@RestController
@RequestMapping(value = "tabs")
@ResponseBody
public class TabsMessageController {

    @Autowired
    private TabsService tabsService;


    @RequestMapping("queryAll")
    public XTabsAllMessage queryAll(){
        return this.tabsService.selectAll();
    }

}
