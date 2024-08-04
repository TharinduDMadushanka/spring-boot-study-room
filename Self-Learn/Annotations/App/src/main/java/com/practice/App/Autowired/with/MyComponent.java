package com.practice.App.Autowired.with;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String doSomething(){
        return "MyComponent is doing something";
    }

}

/**
 * @Component -> marks this class as a Spring component.
 */