package com.tdm.LoginForm.repository;

import com.tdm.LoginForm.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User, String> {
}
