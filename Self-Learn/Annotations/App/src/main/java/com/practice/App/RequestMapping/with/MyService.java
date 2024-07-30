package com.practice.App.RequestMapping.with;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String serve(){
        return "Service called in with @RequestMapping";
    }
}

/**
 * @Service -> Marks the class as a Spring service. This annotation is a specialization of @Component, indicating that this
   class contains business logic.
 */