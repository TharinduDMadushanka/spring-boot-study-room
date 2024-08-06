package com.practice.App.Configurations.without;

public class App {
    public static void main(String[] args) {
        MyRepository myRepository = new MyRepository();
        MyService myService = new MyService(myRepository);
        System.out.println(myService.getData());
    }
}
