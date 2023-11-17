package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Custmer {
    private String name;
    private int id;

    public Custmer(String name,int id) {
        this.name=name;
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }
}
