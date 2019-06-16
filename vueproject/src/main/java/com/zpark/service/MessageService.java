package com.zpark.service;

import com.zpark.pojo.XMessage;
import com.zpark.pojo.XTodo;

import java.util.List;

public interface MessageService {

    XMessage selectByPrimaryKey(Integer xUserid);

    List<XTodo> queryTodoList(XTodo xTodo);

    Integer updateTodo(XTodo xTodo);

    Integer updateVisitCount(XMessage xMessage);

}
