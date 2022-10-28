package com.example.schoolmngtback.controller;

import com.example.schoolmngtback.bean.Administrator;
import com.example.schoolmngtback.implementation.AdminImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("/")
@RestController
@AllArgsConstructor
public class RegistrationController {


    private AdminImpl admin;

    @GetMapping()
    public List<Administrator> viewAdmin(){
        return admin.getAll();
    }

    @PostMapping()
    public Administrator registration(Administrator administrator){
        return admin.create(administrator);
    }
}
