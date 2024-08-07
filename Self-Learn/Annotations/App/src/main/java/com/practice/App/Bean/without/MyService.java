package com.practice.App.Bean.without;

public class MyService {
    private final MyRepository myRepository;

    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String getData() {
        return myRepository.getData();
    }
}
