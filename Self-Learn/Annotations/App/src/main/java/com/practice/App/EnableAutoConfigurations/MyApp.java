package com.practice.App.EnableAutoConfigurations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MyApp {
    public static void main(String[] args) {
        SpringApplication.run(MyApp.class, args);
    }
}

/**
 * @SpringBootApplication is a convenience annotation that includes @EnableAutoConfiguration, @ComponentScan, and @Configuration.
 * Spring Boot automatically configures components based on the dependencies (e.g., if you have spring-boot-starter-data-jpa in your
   classpath, Spring Boot will configure a DataSource, EntityManagerFactory, etc.).
 */