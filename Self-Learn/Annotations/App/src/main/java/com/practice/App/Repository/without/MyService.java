package com.practice.App.Repository.without;

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

 * The service class remains the same as before with @Repository

 * Explanation -> The service class uses the repository to fetch data. The repository will be manually registered as a bean
                  in the configuration class.
 */