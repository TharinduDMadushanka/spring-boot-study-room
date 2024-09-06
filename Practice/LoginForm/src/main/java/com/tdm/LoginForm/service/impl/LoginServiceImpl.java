package com.tdm.LoginForm.service.impl;

import com.tdm.LoginForm.dto.LoginDTO;
import com.tdm.LoginForm.entity.Login;
import com.tdm.LoginForm.repository.LoginRepo;
import com.tdm.LoginForm.service.LoginService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class LoginServiceImpl implements LoginService {

    @Autowired
    private LoginRepo loginRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public LoginDTO login(String email) {

        if (loginRepo.existsById(email)){
            Login login = loginRepo.findById(email).orElse(null);
            return modelMapper.map(login, LoginDTO.class);
        }else {
            return null;
        }
    }
}
