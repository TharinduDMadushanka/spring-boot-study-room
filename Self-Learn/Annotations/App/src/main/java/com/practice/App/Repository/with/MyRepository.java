package com.practice.App.Repository.with;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String fetch() {
        return "Data fetch from repository";
    }
}
