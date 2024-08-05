package com.practice.App.Value.without;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public PropertyReader propertyReader() {
        return new PropertyReader("application.properties");
    }

    @Bean
    public MyComponent myComponent() {
        PropertyReader propertyReader = propertyReader();
        String myValue = propertyReader.getProperty("my.value");
        return new MyComponent(myValue);
    }
}
