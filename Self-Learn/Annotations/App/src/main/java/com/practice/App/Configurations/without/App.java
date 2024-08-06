package com.practice.App.Configurations.without;

public class App {
    public static void main(String[] args) {
        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService(myRepository);
        System.out.println(myService.getData());
    }
}

/**
 * You manually create instances of MyRepository and MyService.
 * You handle dependency injection yourself.
 * The application does not use Spring’s dependency injection container, so you lose benefits like automatic management
   of bean lifecycles and easy configuration.
 */