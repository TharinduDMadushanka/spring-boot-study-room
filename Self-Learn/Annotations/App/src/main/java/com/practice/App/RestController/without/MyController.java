package com.practice.App.RestController.without;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    @GetMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello World";
    }
}

/**
 * With @RestController The class is automatically set up to handle web requests, and all methods return data directly.

 * Without @RestController: You must manually add @ResponseBody to each method, or else the methods will return views
   (typically JSP or Thymeleaf templates).

 * If you don't use @RestController, you lose the convenience of automatically combining @Controller and @ResponseBody

 * use @Controller on the class and @ResponseBody on each method to achieve the same functionality, resulting in more
   boilerplate code.
 */