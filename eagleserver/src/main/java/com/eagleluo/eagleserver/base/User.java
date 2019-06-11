
package com.eagleluo.eagleserver.base;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import lombok.Data;

@Data
@JsonPropertyOrder
public class User {
    private String name;
    private Integer age;

    public void setName( String name ) {
        this.name = name;
    }

    public void setAge( int age ) {
        this.age = age;
    }
    public String getName( ) {
        return name;
    }
    public Integer getAge( ) {
        return age;
    }
}