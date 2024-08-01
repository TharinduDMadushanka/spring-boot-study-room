package com.practice.App.Component.with;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/component")
    @ResponseBody
    public String home(){
        return myService.serve();
    }
}

/**

 * The controller class will use the service to get the message.

 * Explanation -> The controller class handles HTTP GET requests and uses the service class to get the message.
 */