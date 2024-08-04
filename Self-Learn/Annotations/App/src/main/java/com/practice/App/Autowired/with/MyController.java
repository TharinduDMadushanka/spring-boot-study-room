package com.practice.App.Autowired.with;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.serve();
    }
}

/**
 * @RestController -> mark these classes as Spring-managed beans
 * @Autowired ->  used to inject MyService into MyController
 */