package com.tdm.LoginForm.service;

import com.tdm.LoginForm.dto.LoginDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface LoginService {

    LoginDTO login(String email);

}
