package com.practice.App.RestController.with;


import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World!";
    }

}

/**
 * @RestController ->
        * used on the RestController class, which handles HTTP GET requests to the "/hello" endpoint.
        * The hello method returns a plain string, which will be written directly to the HTTP response body as JSON.

 * @GetMapping annotation -> is used for mapping HTTP GET requests onto specific handler methods
 */