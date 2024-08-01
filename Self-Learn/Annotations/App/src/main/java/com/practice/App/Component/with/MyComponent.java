package com.practice.App.Component.with;

import org.springframework.stereotype.Component;

@Component
public class MyComponent {

    public String getMessage(){
        return "message from component class";
    }
}

/**

 * @Component -> * a generic stereotype annotation indicating that the class is a Spring-managed component
                 * It is a generic form of specialized annotations like @Service, @Repository, and @Controller

 * Explanation -> @Component indicates that this class is a Spring-managed component, making it eligible for component
                  scanning and dependency injection.
 */