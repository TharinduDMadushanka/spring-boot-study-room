package com.practice.App.Service.without;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

//@EnableAutoConfiguration
@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {

        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // Register the configuration class
        context.register(AppConfig.class);

        // Refresh the context to apply the configuration
        context.refresh();

        // Run the Spring Boot application
        SpringApplication.run(MyApp.class, args);
    }
}
