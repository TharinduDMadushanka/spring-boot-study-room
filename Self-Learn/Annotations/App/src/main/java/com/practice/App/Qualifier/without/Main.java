package com.practice.App.Qualifier.without;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

/**
 * without @Qualifier, you need to manually configure the beans and their dependencies using a configuration class.
 */

/**
 * @Qualifier ->
     * used to resolve ambiguity by specifying which bean to inject when multiple beans of the same type are present
     * This is particularly useful in larger applications where multiple implementations of a class or interface exist
     * It allows you to inject the correct bean by name.

 * @Qualifier-without ->
     * you need to explicitly define the beans and their dependencies in a configuration class.
     * This approach involves creating @Bean methods for each bean and manually injecting them where needed
     *  This method is more verbose but gives you full control over bean creation and dependency injection.
 */