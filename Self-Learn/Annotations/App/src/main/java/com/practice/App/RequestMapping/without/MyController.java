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

/**

 * This is a regular class without any Spring annotations.

 * It has a method home that handles HTTP requests. The method adds a message to the model and returns the name of the view (home).

 */