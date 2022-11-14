package com.example.schoolmngtback.controller;


import com.example.schoolmngtback.bean.Staff;
import com.example.schoolmngtback.implementation.StaffImpl;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/staff")
@CrossOrigin("*")
@AllArgsConstructor
public class StaffController {
    private StaffImpl staffService;

    @GetMapping("/{id}")
    public Optional<Staff> getById(@PathVariable long id) {
        return staffService.getById(id);
    }

    @GetMapping
    public List<Staff> getAll() {
        return staffService.getAll();
    }

    @PostMapping
    public Staff create(@RequestBody Staff staff) {
        //staff.setRoles(Roles.STAFF);
        return staffService.create(staff);
    }

    @PutMapping("/{id}")
    public Staff update(@RequestBody Staff staff,@PathVariable long id) {
        return staffService.update(staff, id);
    }

    @DeleteMapping("/{id}")
    public void delete(long id) {
        staffService.delete(id);
    }

    @GetMapping("/username/{username}")
    public Staff getStaffByUsername(@PathVariable String username){
        return staffService.getStaffByUsername(username);
    }
}
