package com.practice.App.Controller.with;

@org.springframework.stereotype.Service
public class Service {
    public String serve(){
        return "Service called.!";
    }
}

/**

 * @Service -> Marks the class as a Spring service. This annotation is a specialization of @Component, indicating that
   this class contains business logic.

 */