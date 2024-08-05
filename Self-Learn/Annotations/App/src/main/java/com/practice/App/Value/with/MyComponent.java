package com.practice.App.Value.with;

import org.springframework.beans.factory.annotation.Value;

public class MyComponent {

    @Value("${my.value}")
    private String myValue;

    public String geValue() {
        return myValue;
    }

}
