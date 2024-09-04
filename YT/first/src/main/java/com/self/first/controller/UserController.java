package com.self.first.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
@CrossOrigin
public class UserController {

    @GetMapping("/getUser")
    public String getUser(){
        return "Hello TDM.!";
    }

    @PostMapping("/saveUser")
    public String saveUser(){
        return "User Saved";
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
