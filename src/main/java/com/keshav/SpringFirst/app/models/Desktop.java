package com.keshav.SpringFirst.app.models;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Desktop implements Computer {
    public void compile(){
        System.out.println("Compile by Desktop");
    }
}