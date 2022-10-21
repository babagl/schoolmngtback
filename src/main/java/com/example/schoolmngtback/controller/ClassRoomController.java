package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.ClassRoom;
import com.spring.schoolmngtbackend.dto.ClassRoomDto;
import com.spring.schoolmngtbackend.implementation.ClassRoomImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Classroom")
@CrossOrigin("*")
public class ClassRoomController {
    private ClassRoomImpl service;


    public ClassRoomController(ClassRoomImpl service) {
        this.service=service;
    }

    @GetMapping("/{id}")
    public Optional<ClassRoom> getById(@PathVariable long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<ClassRoom> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ClassRoom create(@RequestBody ClassRoomDto dto) {
        System.out.println(dto.getClassName());
        return service.create(dto);
    }

    @PutMapping
    public ClassRoom update(@RequestBody ClassRoomDto dto) {
        System.out.println(dto.getClassName()+"recuperee");
        return service.update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }
}
