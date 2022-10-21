package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.dto.InstructorDto;
import com.spring.schoolmngtbackend.implementation.InstructorImp;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Instructor")
@CrossOrigin("*")
public class InstructorController {

    private InstructorImp instructorImp;

    public InstructorController(InstructorImp instructorImp) {
        this.instructorImp = instructorImp;
    }

    @GetMapping("/{id}")
    public Optional<Instructor> getById(@PathVariable long id) {
        return instructorImp.getById(id);
    }

    @GetMapping()
    public List<Instructor> getAll() {
        return instructorImp.getAll();
    }

    @PostMapping
    public Instructor create(@RequestBody InstructorDto dto) {
        System.out.println(dto.getFullName()+"recuperee");
        System.out.println(dto.getBirthday()+"recuperee");
        return instructorImp.create(dto);
    }

    @PutMapping
    public Instructor update(@RequestBody InstructorDto dto) {

        return instructorImp.update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        instructorImp.delete(id);
    }

    @GetMapping("/{username}")
    public Instructor getInstructorByUsername(@PathVariable String username){
        return instructorImp.getInstructorByUsername(username);
    }
}
