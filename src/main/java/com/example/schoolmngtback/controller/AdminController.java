package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;
import com.spring.schoolmngtbackend.dto.StudentDto;
import com.spring.schoolmngtbackend.implementation.AdminImpl;
import com.spring.schoolmngtbackend.mapper.StudentMapper;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Administrator")
@CrossOrigin("*")
public class AdminController {

    private AdminImpl services;
    private StudentMapper studentMapper;

    public AdminController(AdminImpl services, StudentMapper studentMapper) {
        this.services = services;
        this.studentMapper = studentMapper;
    }

    @GetMapping("/{id}")
    public Optional<Administrator> getById(@PathVariable long id) {
        return services.getById(id);
    }

   @GetMapping
    public List<Administrator> getAll() {
        return services.getAll();
    }

    @PostMapping
    public Administrator create(@RequestBody AdministratorDto dto) {
        System.out.println(dto.getFullName()+" Administrator Admin");
        /*for (StudentDto dtos : dto.getStudentDtos()) {
            System.out.println(dtos.getFullName()+" Students added");
        }*/
        return services.create(dto);

    }

    @PutMapping
    public Administrator update(@RequestBody AdministratorDto dto) {
        return services.update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        services.delete(id);
    }
    @GetMapping("/username/{username}")
    public Administrator getAdminByUsername(@PathVariable String username){
        return services.getAdminByUsername(username);
    }
}
