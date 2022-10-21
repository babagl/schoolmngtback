package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.Staff;
import com.spring.schoolmngtbackend.dto.StaffDto;
import com.spring.schoolmngtbackend.implementation.StaffImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/Staff")
@CrossOrigin("*")
public class StaffController {
    private StaffImpl staffService;

    public StaffController(StaffImpl staffService) {
        this.staffService = staffService;
    }

    @GetMapping("/{id}")
    public Optional<Staff> getById(@PathVariable long id) {
        return staffService.getById(id);
    }

    @GetMapping
    public List<Staff> getAll() {
        return staffService.getAll();
    }

    @PostMapping
    public Staff create(@RequestBody StaffDto dto) {
        return staffService.create(dto);
    }

    @PutMapping
    public Staff update(@RequestBody StaffDto dto) {
        return staffService.update(dto);
    }

    @DeleteMapping
    public void delete(long id) {
        staffService.delete(id);
    }

    @GetMapping("/{username}")
    public Staff getStaffByUsername(@PathVariable String username){
        return staffService.getStaffByUsername(username);
    }
}
