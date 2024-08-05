package com.practice.App.Value.with;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
        MyComponent myComponent = new MyComponent();
        System.out.println(myComponent.geValue());

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
//        MyComponent myComponent = context.getBean(MyComponent.class);
//        System.out.println(myComponent.geValue());

    }
}
