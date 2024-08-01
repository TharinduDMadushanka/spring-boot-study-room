package com.practice.App.Repository.with;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    private final MyService myService;

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

 * The controller class will use the service to get data.

 * Explanation -> * @Controller annotation indicates that this class is a controller
                  * The service is injected into the controller using constructor injection
                  * @ResponseBody annotation ensures the method’s return value is sent as the HTTP response.
 */