package com.eagleluo.eagleserver.controller;

import java.util.List;

import com.eagleluo.eagleserver.base.TodoItemBase;
import com.eagleluo.eagleserver.model.TodoService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TodoController {

    private TodoService todoserv = new TodoService();

    // 返回todolist的todo列表
    @ResponseBody
    @RequestMapping(name = "/todolist/gettodolist", method = RequestMethod.GET)
    public List<TodoItemBase> getTodoList( ) {

        return todoserv.gettodolist();       

    }
}