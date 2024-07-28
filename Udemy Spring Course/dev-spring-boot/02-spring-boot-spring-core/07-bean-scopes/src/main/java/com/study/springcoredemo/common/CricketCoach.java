package com.study.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component //--> marks the class as a spring beans
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //--> set CricketCoach as Prototype class
public class CricketCoach implements Coach{

    public CricketCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling:-)";
    }
}
