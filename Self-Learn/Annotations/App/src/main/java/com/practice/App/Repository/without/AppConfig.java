package com.practice.App.Repository.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyRepository myRepository() {
        return new MyRepository();
    }

    @Bean
    public MyService myService(){
        return new MyService(myRepository());
    }

    @Bean
    public MyController myController(){
        return new MyController(myService());
    }
}
