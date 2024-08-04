package com.practice.App.Qualifier.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyComponentA myComponentA() {
        return new MyComponentA();
    }

    @Bean
    public MyComponentB myComponentB() {
        return new MyComponentB();
    }

    @Bean
    public MyService myService() {
        return new MyService(myComponentA(), myComponentB());
    }

}
