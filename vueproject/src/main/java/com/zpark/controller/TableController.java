package com.zpark.controller;

import com.github.pagehelper.PageInfo;
import com.zpark.pojo.XTableMsgB;
import com.zpark.service.TableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

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

    @RequestMapping(value = "queryJoinAddress")
    public String queryJoinAddress(XTableMsgB xTableMsg) {
        String  address = tableService.queryJoinAddress(xTableMsg);
        return address;
    }

    @RequestMapping(value = "handleDelete")
    public String handleDelete(@RequestBody Map<String, List<Integer>> array) {
//        System.out.println(array);
//        String json = JSON.toJSONString(array);
//        System.out.println("json"+json);//
//        System.out.println(array.get("array"));
//        Map<String, List<Integer>> map = new HashMap();
//        List<Integer> list = new ArrayList();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.add(4);
//        map.put("array1",list);
//        map.put("array2",list);
//        System.out.println(map);
        Integer xTableMsgBS = tableService.handDelete(array);
        System.out.println(xTableMsgBS);
        return "";

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
