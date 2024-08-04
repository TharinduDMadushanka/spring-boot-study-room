package com.practice.App.Autowired.with;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent myComponent;

    @Autowired
    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public String serve(){
        return myComponent.doSomething();
    }

}
