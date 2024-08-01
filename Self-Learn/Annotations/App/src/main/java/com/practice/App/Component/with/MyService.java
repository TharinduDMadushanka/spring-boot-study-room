package com.practice.App.Component.with;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public String serve(){
        return myComponent.getMessage();
    }
}

/**

 * The service class will use the component to get the message.

 * Explanation -> The service class uses the component class, and the component is injected via constructor injection.

 */