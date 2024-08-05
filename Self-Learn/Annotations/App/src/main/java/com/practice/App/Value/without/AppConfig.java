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

/**
 * AppConfig class is a Spring configuration class that manually defines and configures the beans.
 *
 * ~ Explanation ~

 * Annotation: @Configuration
    * Indicates that this class contains Spring bean definitions.

 * Method: propertyReader()
    * Creates and returns a PropertyReader bean initialized with the application.properties file.

 * Method: myComponent()
     * Uses the PropertyReader bean to read the property value associated with my.value.
     * Creates and returns a MyComponent bean initialized with the retrieved property value.
 */