package com.tdm.LoginForm.controller;

import com.tdm.LoginForm.dto.UserDTO;
import com.tdm.LoginForm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/user")
@CrossOrigin
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/saveUser")
    public UserDTO saveUser(@RequestBody UserDTO userDTO) {
        return userService.saveUser(userDTO);
    }

    @GetMapping("/login/{email}/{password}")
    public UserDTO login(@PathVariable String email, @PathVariable String password) {
//        System.out.println(email +" "+ password);
        return userService.loginUser(email, password);
    }
}
