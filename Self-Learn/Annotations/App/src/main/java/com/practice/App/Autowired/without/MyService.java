package com.practice.App.Autowired.without;

public class MyService {
    private final MyComponent myComponent;

    public MyService(MyComponent myComponent) {
        this.myComponent = myComponent;
    }

    public String serve() {
        return myComponent.doSomething();
    }
}
