package com.practice.App.Autowired.without;

import org.springframework.web.bind.annotation.GetMapping;

public class MyController {
    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home() {
        return myService.serve();
    }
}
