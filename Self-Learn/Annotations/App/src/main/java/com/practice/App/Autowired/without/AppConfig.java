package com.practice.App.Autowired.without;

import org.springframework.context.annotation.Bean;

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
