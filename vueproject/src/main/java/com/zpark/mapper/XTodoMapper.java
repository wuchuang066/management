package com.zpark.mapper;

import com.zpark.pojo.XTodo;
import java.util.List;

public interface XTodoMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(XTodo record);

    XTodo selectByPrimaryKey(Integer id);

    List<XTodo> selectAll();

    int updateByPrimaryKey(XTodo record);
}