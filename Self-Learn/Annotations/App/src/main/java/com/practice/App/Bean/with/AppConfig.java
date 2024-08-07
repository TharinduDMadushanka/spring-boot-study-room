package com.practice.App.Bean.with;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyRepository myRepository() {
        return new MyRepository();
    }

    @Bean
    public MyService myService() {
        return new MyService(myRepository());
    }
}

/**
 * The AppConfig class is annotated with @Configuration and contains methods annotated with @Bean to define the beans.
 *  The myRepository method returns an instance of MyRepository.
 *  The myService method returns an instance of MyService and uses myRepository() to inject the MyRepository dependency.
 */