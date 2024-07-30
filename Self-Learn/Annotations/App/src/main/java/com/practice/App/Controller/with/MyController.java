package com.practice.App.Controller.with;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

    private final Service service;

    public MyController(Service service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("greeting", "Hello World!");
        return "home";
    }
}

/**

 * @Controller -> Marks the class as a Spring MVC controller.

 * home method -> Handles GET requests to the root URL (/). It adds a message to the model and returns the name of the view (home).

 */
