package com.apress.isf.spring.java.model;

import java.lang.reflect.Type;

/**
 * Created by gnan on 8/21/16.
 */
public class Document {
    private String name;
    private MyType type;
    private String location;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public MyType getType() {
        return type;
    }

    public void setType(MyType type) {
        this.type = type;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
