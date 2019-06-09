
package com.eagleluo.eagleserver.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.eagleluo.eagleserver.base.todoitem;
import com.eagleluo.eagleserver.model.todoitemservice;
import com.fasterxml.jackson.databind.util.JSONPObject;

@RestController
public class todolistcontroller {

    private todoitemservice todoitemserv = new todoitemservice();

    // 返回todolist的todo列表
    @ResponseBody
    @RequestMapping("/todolist/gettodolist")
    public JSONPObject getNews(HttpServletRequest request) {

        String callBackMethod = request.getParameter("jsoncallback");
        if (callBackMethod == null) {
            callBackMethod = "";
        }

        //获取符合条件的数据
        List<todoitem> newsList = todoitemserv.gettodolist();

        if (newsList != null) {
            return new JSONPObject(callBackMethod , newsList);
        } else {
            return new JSONPObject(callBackMethod , null);
        }
        

    }
}