package com.practice.App.RequestMapping.with;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String serve(){
        return "Service called in with @RequestMapping";
    }
}
