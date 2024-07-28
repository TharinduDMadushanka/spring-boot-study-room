package com.practice.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

		// manually create object from ApplicationContext interface
		ApplicationContext context= SpringApplication.run(MyAppApplication.class, args);

		// manually create object from Dev class
		Dev obj = context.getBean(Dev.class);
		
		//Dev obj = new Dev(); // manually crete object
		obj.build();
	}

}
