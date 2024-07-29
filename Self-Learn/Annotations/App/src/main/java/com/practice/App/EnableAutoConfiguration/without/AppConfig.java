package com.practice.App.EnableAutoConfiguration.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableWebMvc
@ComponentScan(basePackages = "com.practice.App.EnableAutoConfiguration.without")
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public MyService myService(){
        return new MyService();
    }

    @Bean
    public MyController myController(){
        return new MyController(myService());
    }

}
