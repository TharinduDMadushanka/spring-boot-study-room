package com.practice.App.Service.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public MyController myController() {
        return new MyController(myService());
    }
}

/**
 * Create a configuration class to register manually service as a bean.
 * @Configuration -> indicates that this class contains one or more @Bean methods.
 * @Bean -> methods are used to register beans in the Spring application context.
 */