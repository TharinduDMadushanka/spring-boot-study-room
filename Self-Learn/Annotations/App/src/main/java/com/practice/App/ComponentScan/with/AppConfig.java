package com.practice.App.ComponentScan.with;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @Configuration -> indicates that a class declares one or more @Bean methods and may be processed by the Spring container
    to generate bean definitions and service requests for those beans at runtime.
 */

@Configuration
public class AppConfig{

    @Bean
    public MyService myService(){
        return new MyService();
    }

}
