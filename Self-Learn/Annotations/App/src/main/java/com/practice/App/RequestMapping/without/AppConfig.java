package com.practice.App.RequestMapping.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.ui.Model;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    @Bean
    public MyService myService() {
        return new MyService();
    }

    @Bean
    public MyController myController() {
        return new MyController(myService());
    }

    @Bean
    public RequestMappingHandlerMapping requestMappingHandlerMapping() throws NoSuchMethodException {
        RequestMappingHandlerMapping mapping = new RequestMappingHandlerMapping();
        //mapping.registerMapping("/home", myController(), MyController.class.getMethod("home", Model.class));
        return mapping;
    }
}

/**

 * @Configuration -> Indicates that this class contains Spring bean definitions.

 * @EnableWebMvc -> Enables Spring MVC and sets up default configurations.

 * @Bean -> Used to manually declare beans that should be managed by the Spring container
        * myService(): Declares MyService as a bean.
        * myController(): Declares MyController as a bean, injecting MyService into it.

 * requestMappingHandlerMapping() -> Manually sets up the request mapping for the home method of the MyController class.

 */