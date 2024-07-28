package com.practice.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component //--> tell spring to manage this class then spring create obj for us
public class Dev {

    //Laptop laptop; // give NullPointerException

//    Laptop laptop = new Laptop(); // this works but we have to create object manually

    //@Autowired // field injection
    private Computer comp;

//    public Dev(Laptop laptop) { // constructor injection
//        this.laptop = laptop;
//    }

    @Autowired
    public void setLaptop(Laptop laptop) { // setter injection
        this.comp = laptop;
    }

    public void build(){

        comp.compile(); // give NullPointerException

        System.out.println("Working on a project.");
    }
}
