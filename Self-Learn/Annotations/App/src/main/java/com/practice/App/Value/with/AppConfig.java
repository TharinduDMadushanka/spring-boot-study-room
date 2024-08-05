package com.practice.App.Value.with;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan(basePackages = "com.practice.App.Value.with")
@PropertySource("classpath:application.properties")
public class AppConfig {
}

/**
 * @PropertySource("classpath:application.properties") -> tells Spring to load the properties file.
 */