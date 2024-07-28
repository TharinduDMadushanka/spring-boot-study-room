package com.study.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component //--> marks the class as a spring beans
public class CricketCoach implements Coach{
    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling:-)";
    }
}
