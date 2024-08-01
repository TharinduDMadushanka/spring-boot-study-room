package com.practice.App.Component.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyComponent myComponent() {
        return new MyComponent();
    }

    @Bean
    public MyService myService() {
        return new MyService(myComponent());
    }

    @Bean
    public MyController myController() {
        return new MyController(myService());
    }
}
