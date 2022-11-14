package com.example.schoolmngtback.controller;

import com.example.schoolmngtback.bean.Administrator;
import com.example.schoolmngtback.bean.User;
import com.example.schoolmngtback.implementation.AdminImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
//registration Admin
@RequestMapping("/registry")
@RestController
@AllArgsConstructor
public class RegistrationController {


    private AdminImpl adminImpl;
    @PostMapping()
    public User registration(@RequestBody User user){
        return adminImpl.create(user);
    }
}
