package com.example.schoolmngtback.controller;


import com.example.schoolmngtback.bean.Administrator;
import com.example.schoolmngtback.bean.Roles;
import com.example.schoolmngtback.implementation.AdminImpl;
import lombok.AllArgsConstructor;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Administrator")
@CrossOrigin("*")
@AllArgsConstructor
public class AdminController {

    private AdminImpl services;


    @GetMapping("/{id}")
    public Optional<Administrator> getById(@PathVariable long id) {
        return services.getById(id);
    }

   @GetMapping
    public List<Administrator> getAll() {
        return services.getAll();
    }

    @GetMapping("/search")
    public List<Administrator> getAllSchearch(@RequestParam(name = "keyword", defaultValue = "") String keyword) {
        return services.searchAdmin("%"+keyword+"%");
    }
    @PostMapping
    @PostAuthorize("hasAnyAuthority('admin')")
    public Administrator create(@RequestBody Administrator administrator) {
        System.out.println(administrator.getFullName()+" Administrator recupere");
        administrator.setRoles(Roles.ADMINISTRATOR);
        //administrator.setBirthday(LocalDate.now());
        return services.create(administrator);

    }

    @PutMapping("/{id}")
    public Administrator update(@RequestBody Administrator administrator, @PathVariable long id) {
        return services.update(administrator, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        services.delete(id);
    }


    @GetMapping("/username/{username}")
    public Optional<Administrator> getAdminByUsername(@PathVariable String username){
        return services.getAdminByUsername(username);
    }
}
