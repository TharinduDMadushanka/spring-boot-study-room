package com.practice.App.PropertySource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties.test")
public class AppConfig {

    @Value("${app.name}")
    private String appName;

    @Value("${app.version}")
    private String appVersion;

    public void printProperties() {
        System.out.println("App Name: " + appName);
        System.out.println("App Version: " + appVersion);
    }
}

/**
 * @PropertySource("classpath:application.properties.test") -> ells Spring to load properties from the app.properties file.
 * @Value("${app.name}") and @Value("${app.version}") inject the properties into the fields.
 */