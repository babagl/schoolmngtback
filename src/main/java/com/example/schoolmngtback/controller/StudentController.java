package com.spring.schoolmngtbackend.controller;
import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.dto.StudentDto;
import com.spring.schoolmngtbackend.implementation.StudentsImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Students")
@CrossOrigin("*")
public class StudentController {

    private StudentsImpl studentService;

    public StudentController(StudentsImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Optional<Students> getById(@PathVariable long id) {
        return studentService.getById(id);
    }

    @GetMapping
    public List<Students> getAll() {
        return studentService.getAll();
    }


    @PostMapping
    public Students create(@RequestBody StudentDto dto) {
        return studentService.create(dto);
    }

    @PutMapping
    public Students update(@RequestBody StudentDto dto) {
        return studentService.update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        studentService.delete(id);
    }

    @GetMapping("/{username}")
    public Students getStudentByUsername(@PathVariable String username){
        return studentService.getStudentByUsername(username);
    }
}
