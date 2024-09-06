package com.tdm.LoginForm.repository;

import com.tdm.LoginForm.entity.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, String> {
}
