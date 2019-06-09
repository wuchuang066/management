package com.zpark.mapper;

import com.zpark.pojo.XTodo;

import java.util.List;

public interface XTodoMapperB {

    List<XTodo> selectAll(XTodo xTodo);

    int updateTodo(XTodo record);
}