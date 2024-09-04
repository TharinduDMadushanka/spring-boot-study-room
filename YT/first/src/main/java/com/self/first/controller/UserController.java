package com.self.first.controller;

import com.self.first.dto.UserDTO;
import com.self.first.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/getUser")
    public String getUser(){
        return "Hello TDM.!";
    }

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO){
        return userService.userSave(userDTO);
    }

    @PutMapping("/updateUser")
    public String updateUser(){
        return "User Updated";
    }

    @DeleteMapping("/deleteUser")
    public String deleteUser(){
        return "User Delete";
    }

}
