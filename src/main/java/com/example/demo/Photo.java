package com.example.demo;

public class Photo {
    //属性id:string name:string content:byte
    private String id;
    private String name;

    //构造函数
    public Photo(String id, String name) {
        this.id = id;
        this.name = name;
    }

    //getter和setter
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }
    

}
