
package com.eagleluo.eagleserver.model;

import java.util.ArrayList;
import java.util.List;
import com.eagleluo.eagleserver.base.TodoItemBase;

public class TodoService {

    public List<TodoItemBase> todolist = new ArrayList<>();
        
    public List<TodoItemBase> gettodolist() {

        todolist.clear();

        TodoItemBase item = new TodoItemBase();
        item.setText( "今天工作需要完成" );
        todolist.add( item );

        item = new TodoItemBase();
        item.setText( "月度汇报整理" );
        todolist.add( item );
    
        return todolist;
    }


}