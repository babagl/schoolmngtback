package com.example.schoolmngtback.controller;

import com.example.schoolmngtback.bean.ClassRoom;
import com.example.schoolmngtback.implementation.ClassRoomImpl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Classroom")
@CrossOrigin("*")
@AllArgsConstructor
public class ClassRoomController {
    private ClassRoomImpl service;


    @GetMapping("/{id}")
    public Optional<ClassRoom> getById(@PathVariable long id) {
        return service.getById(id);
    }

    @GetMapping
    public List<ClassRoom> getAll() {
        return service.getAll();
    }

    @PostMapping
    public ClassRoom create(@RequestBody ClassRoom classRoom) {

        return service.create(classRoom);
    }

    @PutMapping("/{id}")
    public ClassRoom update(@RequestBody ClassRoom classRoom, @PathVariable long id) {
        return service.update(classRoom,id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        service.delete(id);
    }


}
