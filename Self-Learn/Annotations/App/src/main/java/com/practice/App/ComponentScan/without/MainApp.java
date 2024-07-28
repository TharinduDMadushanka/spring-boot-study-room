package com.practice.App.ComponentScan.without;

// Main class to bootstrap the application
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * registerBean -> method is used to manually register the MyService bean
 * refresh method -> called to initialize the application context.
 * getBean method -> retrieves the bean from the context.
 * context is closed to release resources.

 ** This approach manually registers and configures the beans without using the @Configuration annotation.
 */

public class MainApp {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        // Manually register the bean
        context.registerBean(MyService.class, MyService::new);

        context.refresh();

        MyService myService = context.getBean(MyService.class);
        myService.serve();

        context.close();

    }
}
