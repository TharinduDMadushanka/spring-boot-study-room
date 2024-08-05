package com.practice.App.Value.without;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyComponent myComponent = context.getBean(MyComponent.class);
        System.out.println(myComponent.getValue());
    }
}