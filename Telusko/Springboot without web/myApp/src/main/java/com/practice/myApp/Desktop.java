package com.practice.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{

    public void compile(){
        System.out.println("Compile 404 bug faster.!");
    }
}
