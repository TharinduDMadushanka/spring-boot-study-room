package com.practice.App.Qualifier.with;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        MyService myService = context.getBean(MyService.class);
//        System.out.println(myService.serve());
        SpringApplication.run(Main.class, args);
    }
}