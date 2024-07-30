package com.tdm.simpleWebApp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Hello Welcome";
    }

    @RequestMapping("/about")
    public String about(){
        return "Hello About";
    }

}

/**
 * @ Controller not return the string into web
 * but we add @ResponseBody to the method it will shoe

 * to achieve it easily we can simply add @RestController for the class instead that 2 annotations
 */