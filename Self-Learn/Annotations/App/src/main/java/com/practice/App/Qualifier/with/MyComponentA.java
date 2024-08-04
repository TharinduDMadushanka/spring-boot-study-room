package com.practice.App.Qualifier.with;

import org.springframework.stereotype.Component;

@Component
public class MyComponentA {
    public String doSomething() {
        return "MyComponentA is doing something!";
    }
}

/**
 * You want to inject both of these into a service, but without using @Qualifier, Spring would not know which one to inject
 * Explanation -> Both MyComponentA and MyComponentB are marked with @Component, making them Spring beans.
 */