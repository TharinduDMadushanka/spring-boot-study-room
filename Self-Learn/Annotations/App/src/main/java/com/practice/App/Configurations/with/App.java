package com.practice.App.Configurations.with;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = context.getBean(MyService.class);
        System.out.println(myService.getData());
    }
}
/**
 * App initializes the Spring context and retrieves MyService to use it.
 */