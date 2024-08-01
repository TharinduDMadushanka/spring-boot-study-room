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

/**

 * Manually register the repository as a bean.

 * Explanation -> * @Configuration annotation indicates that this class contains one or more @Bean methods.
                  * @Bean methods are used to register beans in the Spring application context.

 */