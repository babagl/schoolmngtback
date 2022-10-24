package com.example.schoolmngtback.controller;


import com.example.schoolmngtback.bean.Instructor;
import com.example.schoolmngtback.bean.Roles;
import com.example.schoolmngtback.implementation.InstructorImp;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Instructor")
@CrossOrigin("*")
@AllArgsConstructor
public class InstructorController {

    private InstructorImp instructorImp;


    @GetMapping("/{id}")
    public Optional<Instructor> getById(@PathVariable long id) {
        return instructorImp.getById(id);
    }

    @GetMapping()
    public List<Instructor> getAll() {
        return instructorImp.getAll();
    }

    @PostMapping
    public Instructor create(@RequestBody Instructor instructor) {
        System.out.println(instructor.getFullName()+"recuperee");
        System.out.println(instructor.getBirthday()+"recuperee");
        instructor.setRoles(Roles.INSTRUCTOR);
        return instructorImp.create(instructor);
    }

    @PutMapping("/{id}")
    @CrossOrigin("*")
    public Instructor update(@RequestBody Instructor instructor, @PathVariable long id) {

        return instructorImp.update(instructor, id);
    }

    @DeleteMapping("/{id}")
    @CrossOrigin("*")
    public void delete(@PathVariable long id) {
        instructorImp.delete(id);
    }

    @GetMapping("/username/{username}")
    @CrossOrigin("*")
    public Instructor getInstructorByUsername(@PathVariable String username){
        return instructorImp.getInstructorByUsername(username);
    }
}
