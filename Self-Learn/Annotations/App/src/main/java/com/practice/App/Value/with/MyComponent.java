package com.practice.App.Value.with;

import org.springframework.beans.factory.annotation.Value;

public class MyComponent {

    @Value("${my.value}")
    private String myValue;

    public String geValue() {
        return myValue;
    }
}

/**
 * @Value("${my.value}") -> injects the value of my.value from the application.properties file into the myValue field.
 * The MyComponent bean is configured to read the property value and print it.
 */