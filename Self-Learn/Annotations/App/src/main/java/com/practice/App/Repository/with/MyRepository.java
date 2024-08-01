package com.practice.App.Repository.with;

import org.springframework.stereotype.Repository;

@Repository
public class MyRepository {

    public String fetch() {
        return "Data fetch from repository";
    }
}

/**
 * @Repository -> * used to indicate that a class is a "Repository" or "Data Access Object" (DAO).
                  * It’s a specialization of the @Component annotation with additional functionality related to exception translation
                    for database operations.

 * Explanation -> The @Repository annotation tells Spring that this class is a data repository, which means it should be
                  treated as a bean for dependency injection and provides exception translation for database operations.
 */
