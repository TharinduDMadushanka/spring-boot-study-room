package com.practice.App.Service.without;

public class MyService {
    public String serve(){
        return "Service class called without @Service annotation";
    }
}

/**
 * Define the service class without using @Service.
 * Explanation -> This is a plain Java class without any Spring annotations.
 */