package com.practice.App.Service.with;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

    private final MyService myService;

    public MyController(MyService myService) {
        this.myService = myService;
    }

    @GetMapping("/service")
    @ResponseBody
    public String message(){
        return myService.serve();
//        return "hello mf";
    }
}

/**

 *  @Controller -> annotation is used to define a controller

 *  @GetMapping -> maps the HTTP GET requests to the message() method.

 *  @ResponseBody -> * indicates that the return value of the method will be the response body, not a view name.
                     * without this the method value not showing in the web page

 * Explanation -> This controller handles the root URL ("/service") and returns the result of the serve method from the MyService class.
 */