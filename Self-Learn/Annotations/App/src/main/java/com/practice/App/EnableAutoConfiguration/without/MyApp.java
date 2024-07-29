package com.practice.App.EnableAutoConfiguration.without;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyApp {

    public static void main(String[] args) {

        SpringApplicationBuilder builder = new SpringApplicationBuilder(MyApp.class);
        builder.web(WebApplicationType.SERVLET);

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.register(AppConfig.class);
        context.refresh();

        SpringApplication.run(MyApp.class, args);
    }
}
