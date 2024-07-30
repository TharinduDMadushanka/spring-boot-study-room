package com.tdm.simpleWebApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @RequestMapping("/login")
    public String login() {
        return "Logging page..!";
    }

}

/**
 * we can add any of controller class
 * simply request going in to the front controller who makes us for spring framework
 * and it looking for all of Request handle annotations
 */