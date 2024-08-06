package com.practice.App.Configurations.with;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @GetMapping("/config")
    public String greet() {
        return "Hello from @Configuration!";
    }
}