
package com.eagleluo.eagleserver.model;

import java.util.ArrayList;
import java.util.List;
import com.eagleluo.eagleserver.base.TodoItem;

public class TodoItemService {

    public List<TodoItem> todolist = new ArrayList<>();
        
    public List<TodoItem> gettodolist() {

        TodoItem item = new TodoItem();
        item.setText( "今天工作需要完成" );
        todolist.add( item );
    
        return todolist;
    }


}