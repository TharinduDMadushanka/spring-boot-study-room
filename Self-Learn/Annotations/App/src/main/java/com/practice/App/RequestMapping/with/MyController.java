package com.practice.App.RequestMapping.with;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @RequestMapping("/")
    public String home(Model model) {
        model.addAttribute("myService", myService);
        return "home"; // Return view name (e.g., home.html)
    }

}
