package com.tdm.LoginForm.service;

import com.tdm.LoginForm.dto.UserDTO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public interface UserService {

    UserDTO saveUser(UserDTO userDTO);
    UserDTO loginUser(String email, String password);

}
