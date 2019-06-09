package com.zpark.service.impl;

import com.zpark.mapper.XMessageMapperB;
import com.zpark.mapper.XTodoMapperB;
import com.zpark.pojo.XMessage;
import com.zpark.pojo.XTodo;
import com.zpark.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private XMessageMapperB messageMapperB;

    @Autowired
    private XTodoMapperB todoMapperB;

    @Override
    public XMessage selectByPrimaryKey(Integer xUserid) {
        return this.messageMapperB.selectByPrimaryKey(xUserid);
    }

    @Override
    public List<XTodo> queryTodoList(XTodo xTodo) {
        return this.todoMapperB.selectAll(xTodo);
    }

    @Override
    public Integer updateTodo(XTodo xTodo) {
        return this.todoMapperB.updateTodo(xTodo);
    }
}
