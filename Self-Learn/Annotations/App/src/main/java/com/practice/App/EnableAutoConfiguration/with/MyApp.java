package com.practice.App.EnableAutoConfiguration.with;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class MyApp {

    @GetMapping
    public String hello() {
        return "Hello World..!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}

/**
 *
 */