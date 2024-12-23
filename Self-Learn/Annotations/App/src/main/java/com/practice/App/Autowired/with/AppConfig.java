package com.practice.App.Autowired.with;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice.App.Autowired.with")
public class AppConfig {
}

/**
 * @ComponentScan -> tells Spring to scan the specified package for components.
 */