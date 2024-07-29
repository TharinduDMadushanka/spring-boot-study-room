package com.practice.App.EnableAutoConfiguration.with;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableAutoConfiguration
@RestController
public class MyApp {

    @GetMapping("/hello")
    public String hello() {
        return "Hello World..!";
    }

    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}

/**
 * org.springframework.boot.SpringApplication -> sets up the default configuration, starts the Spring application context,
   and performs classpath scanning.

 * org.springframework.boot.autoconfigure.EnableAutoConfiguration -> EnableAutoConfiguration annotation tells Spring Boot
   to start adding beans based on classpath settings, other beans, and various property settings

 * GetMapping annotation -> shortcut for @RequestMapping(method = RequestMethod.GET) and is used to map HTTP GET requests
   to specific handler methods.

 */

/**

 * @EnableAutoConfiguration ->
        * This annotation enables the auto-configuration feature of Spring Boot. It automatically configures the Spring
          application based on the dependencies present on the classpath
        * For example, if you have spring-boot-starter-web on the classpath, it will configure web-related components
          such as a DispatcherServlet.

 * @RestController ->
        * This annotation indicates that the class is a REST controller. It combines the functionality of
          @Controller and @ResponseBody.
        * Any method in this class that returns a value will have that value written directly to the HTTP response body.

 * @GetMapping("/") -> * This annotation maps HTTP GET requests to the / path to the home method.
                       * http://localhost:8080/hello in here prints "Hello World..!"
 */
