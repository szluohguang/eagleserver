
package com.eagleluo.eagleserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import com.eagleluo.eagleserver.base.TodoItem;
import com.eagleluo.eagleserver.model.TodoItemService;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class todolistcontroller {

    private TodoItemService todoitemserv = new TodoItemService();

    // 返回todolist的todo列表
    @ResponseBody
    @RequestMapping(name = "/todolist/gettodolist", method = RequestMethod.GET)
    public TodoItem getTodoList( ) {

        TodoItem item = new TodoItem();
        item.setText("test");

        return item;

        /*
        String callBackMethod = request.getParameter("jsoncallback");
        if (callBackMethod == null) {
            callBackMethod = "";
        }

        //获取符合条件的数据
        List<TodoItem> newsList = todoitemserv.gettodolist();

        if (newsList != null) {
            return new JSONPObject(callBackMethod , newsList);
        } else {
            return new JSONPObject(callBackMethod , null);
        }

        */
        

    }
}