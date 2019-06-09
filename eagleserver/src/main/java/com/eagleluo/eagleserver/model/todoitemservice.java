
package com.eagleluo.eagleserver.model;

import java.util.ArrayList;
import java.util.List;
import com.eagleluo.eagleserver.base.todoitem;

public class todoitemservice {

    public List<todoitem> todolist = new ArrayList<>();
        
    public List<todoitem> gettodolist() {

        todoitem item = new todoitem();
        item.setText( "今天工作需要完成" );
        todolist.add( item );
    
        return todolist;
    }


}