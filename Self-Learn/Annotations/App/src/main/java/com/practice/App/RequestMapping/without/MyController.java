package com.practice.App.RequestMapping.without;

import org.springframework.ui.Model;

public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    public String home(Model model) {
        model.addAttribute("message", myService.serve());
        return "home"; // Return view name (e.g., home.html)
    }

}
