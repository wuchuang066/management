package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.XTableMsgB;
import com.zpark.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
@RequestMapping(value = "table")
@ResponseBody
public class TableController {
    @Autowired
    private TableService tableService;

    @RequestMapping(value = "queryTableMsg")
    public PageInfo<XTableMsgB> queryTableMsg(XTableMsgB xTableMsg, Integer pageNumber) {
        return tableService.selectAll(xTableMsg, pageNumber);

    }

    @RequestMapping(value = "updateTableMsg")
    public Integer updateTableMsg(XTableMsgB xTableMsg) {
        System.out.println(xTableMsg);
        Integer integer = tableService.updateTableMsg(xTableMsg);
        return integer;

    }

    @RequestMapping(value = "addTableMsg")
    public Integer addTableMsg(XTableMsgB xTableMsg) {
        System.out.println(xTableMsg);
        Integer integer = tableService.addTableMsg(xTableMsg);
        return integer;

    }
    /**
     * 功能描述：时间类型传过来自动转换格式
     * @author wuc
     * @date 2019/6/16
     * @param request
     * @param binder
     * @return void
     */
    @InitBinder
    protected void init(HttpServletRequest request, ServletRequestDataBinder binder) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }

}
