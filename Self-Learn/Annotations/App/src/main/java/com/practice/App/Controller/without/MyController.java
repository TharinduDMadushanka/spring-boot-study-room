package com.practice.App.Controller.without;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", myService.serve());
        return "home";
    }
}

/**

 * This is a regular class without any Spring annotations.

 * It has a method home that handles GET requests to the root URL (/).The method adds a message to the model and returns
   the name of the view (home).

 */