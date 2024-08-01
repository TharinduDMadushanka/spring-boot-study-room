package com.practice.App.Service.without;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/service")
    @ResponseBody
    public String home() {
        return myService.serve();
    }
}

/**
 * Explanation -> The controller class remains the same, injecting the service class via constructor injection.
 * Same like using @Service annotation
 */