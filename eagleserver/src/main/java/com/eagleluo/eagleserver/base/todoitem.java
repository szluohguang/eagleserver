package com.eagleluo.eagleserver.base;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoItem {
    private boolean checked;
    private String text;
    private boolean isDelete;

    
    public void todoitem() {
        this.checked = false;
        this.text = "";
        this.isDelete = false;
    }

    public void setText( String text ) {
        this.text = text;
    }
}