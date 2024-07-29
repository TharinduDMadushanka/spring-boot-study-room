package com.practice.App.ComponentScan.without;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@EnableAutoConfiguration
public class MainApp {
    public static void main(String[] args) {

        // Create the application context
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // Register the configuration class
        context.register(AppConfig.class);

        // Refresh the context to apply the configuration
        context.refresh();

        SpringApplication.run(MainApp.class, args);
    }
}
