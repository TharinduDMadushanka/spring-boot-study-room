package com.practice.App.ComponentScan.with;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 *  @Configuration -> indicates that a class declares one or more @Bean methods and may be processed by the Spring container
    to generate bean definitions and service requests for those beans at runtime.

 *  @Bean -> annotation in Spring is used to declare a bean. A bean is an object that is managed by the Spring IoC
           (Inversion of Control) container
 */

@Configuration
public class AppConfig{

    @Bean
    public MyService myService(){
        return new MyService();
    }

}
