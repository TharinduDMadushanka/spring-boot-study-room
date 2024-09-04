package com.self.first.repo;

import com.self.first.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer> {

    //unique method
    @Query(value = "SELECT * FROM user WHERE id = ?", nativeQuery = true)
    User getUserByUserID(String userID);

}
