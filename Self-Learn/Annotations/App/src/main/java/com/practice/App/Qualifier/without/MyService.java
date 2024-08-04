package com.practice.App.Qualifier.without;

public class MyService {
    private final MyComponentA myComponentA;
    private final MyComponentB myComponentB;

    public MyService(MyComponentA myComponentA, MyComponentB myComponentB) {
        this.myComponentA = myComponentA;
        this.myComponentB = myComponentB;
    }

    public String serve() {
        return myComponentA.doSomething() + " and " + myComponentB.doSomething();
    }
}
