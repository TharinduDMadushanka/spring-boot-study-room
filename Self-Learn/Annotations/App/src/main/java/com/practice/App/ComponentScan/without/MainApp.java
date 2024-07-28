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

/**
 * AnnotationConfigApplicationContext -> an implementation of the ApplicationContext interface, designed for annotation-based configuration.

 * new AnnotationConfigApplicationContext() -> initializes a new instance of the context, but does not yet load or refresh it.

 * registerBean method registers a bean definition with the context.

 * It takes two arguments:
        * The class type of the bean (MyService.class).
        * A Supplier (in this case, a method reference MyService::new) which tells the context how to create an instance of the bean.

 * Bean Definition -> This tells the context that it should manage a bean of type MyService and use the new MyService() constructor to create instances.

 * context.refresh(); -> * The refresh method initializes the Spring application context, loading all the bean definitions and processing them.
                         * This step is crucial as it effectively "starts" the Spring container, making all registered beans available for use.

 * getBean -> * method fetches an instance of the specified bean from the context.
              * In this case, it retrieves the MyService bean that was registered earlier.

 * ontext.close(); -> * close method gracefully shuts down the application context, releasing all resources and ensuring
                        any bean destruction callbacks are invoked.This is important for managing resource cleanup.
 */
