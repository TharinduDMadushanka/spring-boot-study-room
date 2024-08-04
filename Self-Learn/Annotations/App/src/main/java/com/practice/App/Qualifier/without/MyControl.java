package com.practice.App.Qualifier.without;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyControl {

    private final MyService myService;

    public MyControl(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/qul")
    @ResponseBody
    public String qul() {
        return myService.serve();
    }

}
