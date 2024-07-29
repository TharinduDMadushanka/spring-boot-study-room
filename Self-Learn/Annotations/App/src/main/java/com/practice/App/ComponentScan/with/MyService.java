package com.practice.App.ComponentScan.with;

import org.springframework.stereotype.Component;

@Component
public class MyService {
    public void serve(){
        System.out.println("Service called..!");
    }
}
