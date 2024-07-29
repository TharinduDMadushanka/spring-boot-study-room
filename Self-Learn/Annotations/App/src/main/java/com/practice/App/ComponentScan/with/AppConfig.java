package com.practice.App.ComponentScan.with;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.practice.App.ComponentScan.with")
public class AppConfig {
}


/**

 * @ComponentScan -> * auto-detecting and registering Spring-managed components (e.g. beans, controllers, services, repositories, etc.)
                      within a specified package or set of packages.

 * @Configuration -> * indicating that an object is a source of bean definitions
                     * @Configuration classes declare beans through @Bean -annotated methods. Calls to @Bean methods on
                       @Configuration classes can also be used to define inter-bean dependencies.
 */