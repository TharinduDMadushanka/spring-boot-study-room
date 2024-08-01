package com.practice.App.Repository.without;

import com.practice.App.Repository.without.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    private final MyService myService;

    @Autowired
    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/repository")
    @ResponseBody
    public String home(){
        return myService.serve();
    }
}

/**

 * The controller class remains the same as before with @Repository

 * Explanation -> The controller uses the service to get data.

 */