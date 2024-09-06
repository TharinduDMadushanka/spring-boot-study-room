package com.tdm.LoginForm.controller;

import com.tdm.LoginForm.dto.LoginDTO;
import com.tdm.LoginForm.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/login")
@CrossOrigin
public class LoginController {

    @Autowired
    private LoginService loginService;

    @GetMapping("/getUser/{email}")
    public LoginDTO login(@PathVariable("email") String email) {
        return loginService.login(email);
    }

}
