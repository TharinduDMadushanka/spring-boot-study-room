package com.tdm.LoginForm.service.impl;

import com.tdm.LoginForm.dto.UserDTO;
import com.tdm.LoginForm.entity.User;
import com.tdm.LoginForm.repository.UserRepo;
import com.tdm.LoginForm.service.UserService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepo userRepository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public UserDTO saveUser(UserDTO userDTO) {
        userRepository.save(modelMapper.map(userDTO, User.class));

        return userDTO;
    }

    @Override
    public UserDTO loginUser(String email, String password) {

        if (userRepository.existsById(email) && userRepository.existsById(password)) {
            User existEmail = userRepository.findById(email).orElse(null);
            User existPassword = userRepository.findById(password).orElse(null);

            if (existEmail != null && existPassword != null) {
                return modelMapper.map(existEmail, UserDTO.class);
            } else {
                return null;
            }
        } else {
            return null;
        }
    }
}
