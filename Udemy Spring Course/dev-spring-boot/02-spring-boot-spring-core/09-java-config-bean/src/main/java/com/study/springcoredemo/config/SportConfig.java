package com.study.springcoredemo.config;

import com.study.springcoredemo.common.Coach;
import com.study.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean("aqua") // Bean ID
    public Coach swimCoach(){
        return new SwimCoach();
    }
}
