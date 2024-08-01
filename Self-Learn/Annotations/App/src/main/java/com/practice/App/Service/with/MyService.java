package com.practice.App.Service.with;

import org.springframework.stereotype.Service;

@Service
public class MyService {

    public String serve(){
        return "Service class is called.!";
    }
}

/**
 * @Service -> * specialization of the @Component annotation
               * indicating that this class holds the business logic.

 *  Explanation -> @Service tells Spring that this class is a service component, making it a candidate for auto-detection
                 during classpath scanning.
 */