package lk.practice;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        Dev obj = new Dev();

        // container ready
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

//        Dev obj = context.getBean(Dev.class);
        Dev obj = (Dev) context.getBean("dev");

        obj.build();

    }
}