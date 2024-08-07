package com.practice.App.Bean.without;

public class App {
    public static void main(String[] args) {
        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService(myRepository);
        System.out.println(myService.getData());
    }
}

/**
 * You manually create instances of MyRepository and MyService.
 * You handle dependency injection yourself by passing MyRepository to the constructor of MyService.
 */