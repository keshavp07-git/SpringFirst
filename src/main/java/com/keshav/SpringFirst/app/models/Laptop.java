package com.keshav.SpringFirst.app.models;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    public void compile(){
        System.out.println("Compile by Laptop");
    }
}
