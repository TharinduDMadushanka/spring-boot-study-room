package com.practice.App.Qualifier.with;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyComponentA myComponentA;
    private final MyComponentB myComponentB;

    @Autowired
    public MyService(@Qualifier("myComponentA") MyComponentA myComponentA,
                     @Qualifier("myComponentB") MyComponentB myComponentB) {
        this.myComponentA = myComponentA;
        this.myComponentB = myComponentB;
    }

    public String serve() {
        return myComponentA.doSomething() + " and " + myComponentB.doSomething();
    }
}

/**
 * @Qualifier("myComponentA") -> tells Spring to inject the MyComponentA bean.
 * @Qualifier("myComponentB") -> tells Spring to inject the MyComponentB bean.
 * @Autowired-with-@Qualifier -> ensures that the correct beans are injected into MyService.
 */