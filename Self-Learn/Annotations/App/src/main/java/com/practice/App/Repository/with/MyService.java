package com.practice.App.Repository.with;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

    private final MyRepository myRepository;

    @Autowired
    public MyService(MyRepository myRepository) {
        this.myRepository = myRepository;
    }

    public String serve(){
        return myRepository.fetch();
    }
}

/**

 * The service class will use the repository to fetch data.

 * @Autowired -> automatic dependency injection

 * Explanation -> The @Service annotation tells Spring that this class holds the business logic. The repository is injected
                  into the service using constructor injection.
 */