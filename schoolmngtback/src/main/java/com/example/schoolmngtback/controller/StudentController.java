package com.example.schoolmngtback.controller;
import com.example.schoolmngtback.bean.Roles;
import com.example.schoolmngtback.bean.Students;
import com.example.schoolmngtback.implementation.StudentsImpl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Students")
@CrossOrigin("*")
@AllArgsConstructor
public class StudentController {

    private StudentsImpl studentService;


    @GetMapping("/{id}")
    public Optional<Students> getById(@PathVariable long id) {
        return studentService.getById(id);
    }

    @GetMapping
    public List<Students> getAll() {
        return studentService.getAll();
    }


    @PostMapping
    public Students create(@RequestBody Students student) {
        student.setRoles(Roles.STUDENT);
        student.setRegistrationDate(LocalDateTime.now());
        System.out.println(student.getFullName()+"registred");
        return studentService.create(student);
    }

    @PutMapping("/{id}")
    public Students update(@RequestBody Students student, @PathVariable long id) {
        return studentService.update(student, id);
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
