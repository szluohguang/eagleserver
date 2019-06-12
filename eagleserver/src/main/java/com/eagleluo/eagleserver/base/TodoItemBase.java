package com.eagleluo.eagleserver.base;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TodoItemBase {

    private boolean checked = false;
    private String text ="";
    private boolean isDelete = false;


    public void setText( String text ) {
        this.text = text;
    }
    public void setChecked( boolean checked) {
        this.checked = checked;
    }
    public void setIsDelete( boolean isDelete ) {
        this.isDelete = isDelete;
    }

    public String getText( ) {
        return text;
    }
    public boolean getChecked() {
        return checked;
    }
    public boolean getIsDelete() {
        return isDelete;
    }

}