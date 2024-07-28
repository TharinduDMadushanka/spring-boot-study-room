package com.study.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach {

    public TrackCoach() {
        System.out.println("In constructor: "+getClass().getSimpleName());
    }

    @Override
    public String getDailyWorkout() {
        return "Run hard on the track!";
    }
}
