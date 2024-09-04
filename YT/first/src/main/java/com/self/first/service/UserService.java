package com.self.first.service;

import com.self.first.dto.UserDTO;
import com.self.first.entity.User;
import com.self.first.repo.UserRepo;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class UserService {

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private ModelMapper modelMapper;


    public UserDTO userSave(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO, User.class));

        return userDTO;
    }

}
