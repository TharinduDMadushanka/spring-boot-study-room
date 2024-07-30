package com.practice.App.Controller.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@EnableWebMvc
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

 * @Configuration -> Indicates that this class contains Spring bean definitions.

 * @EnableWebMvc -> Enables Spring MVC and sets up default configurations.

 * @Bean -> Used to manually declare beans that should be managed by the Spring container.
        * myService(): Declares MyService as a bean.
        * myController(): Declares MyController as a bean, injecting MyService into it.

 */