package com.practice.App.Configuration.with;

// Main class to bootstrap the application
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * ApplicationContext Interface -> * central interface in the Spring framework for providing configuration information to an application.
                         *It represents the Spring IoC (Inversion of Control) container and is responsible for instantiating,
                          configuring, and assembling the beans.

 * AnnotationConfigApplicationContext Class -> * an implementation of the ApplicationContext interface.
                        * It is used to bootstrap a Spring application from Java-based configuration (annotated classes).

 * AppConfig.class -> * AppConfig is a configuration class annotated with @Configuration.
                      * It contains one or more @Bean annotated methods, which are used to define beans.

 * new AnnotationConfigApplicationContext(AppConfig.class) -> statement creates an instance of AnnotationConfigApplicationContext

 * MyService myService = context.getBean(MyService.class); ->
        * context.getBean(MyService.class) -> getBean method of the ApplicationContext interface retrieves a bean from the Spring container.
        * Retrieving the Bean -> The Spring container looks up the bean definition for MyService and returns an instance of MyService.
        * This instance is fully configured and managed by the Spring container, meaning that any dependencies it requires are already injected.
          Using the Bean:
        * The retrieved bean (myService) can now be used as a regular object in the application.
        * In this case, the serve method of MyService can be called to perform its functionality.
 */

public class MainApp {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        MyService myService = context.getBean(MyService.class);
        myService.serve();
    }
}

