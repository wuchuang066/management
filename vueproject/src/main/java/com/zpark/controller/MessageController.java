package com.zpark.controller;

import com.zpark.pojo.XMessage;
import com.zpark.pojo.XTodo;
import com.zpark.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("message")
@RestController
@ResponseBody
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("queryMessage")
    public XMessage queryMessage(XMessage message){
        return this.messageService.selectByPrimaryKey( message.getxUserid());
    }

    @PostMapping("queryTodoList")
    private List<XTodo> queryTodoList(XTodo xTodo){
        List<XTodo> xTodos = this.messageService.queryTodoList(xTodo);

        return xTodos;
    }
    @PostMapping("updateTodo")
    private Integer updateTodo(XTodo xTodo){
        Integer integer = this.messageService.updateTodo(xTodo);
        return integer;
    }
}
