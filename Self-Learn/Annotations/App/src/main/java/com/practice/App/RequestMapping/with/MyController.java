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

/**

 * @Controller -> Marks the class as a Spring MVC controller.

 * @RequestMapping("/") -> Maps HTTP requests to the home method, which handles requests to the root URL (/).
   The method adds a message to the model and returns the name of the view (home).

 */