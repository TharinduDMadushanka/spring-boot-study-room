package com.practice.App.SpringBootApplication.without;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
@ComponentScan
public class App {
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
        System.out.println("This is without @SpringBootApplication annotation");
    }
}


/**
 * @SpringBootApplication == @Configuration + @EnableAutoConfiguration + @ComponentScan

 * @Configuration -> indicates that the class can be used by the Spring IoC container as a source of bean definitions

 * @EnableAutoConfiguration -> tells Spring Boot to start adding beans based on classpath settings, other beans,
   and various property settings

 * @ComponentScan -> tells Spring to scan for components, configurations, and services in the specified package

 ** By using @SpringBootApplication, you simplify the configuration of your Spring Boot application by combining these
    three annotations into one
 */