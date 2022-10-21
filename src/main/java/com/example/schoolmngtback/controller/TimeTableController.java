package com.spring.schoolmngtbackend.controller;

import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.TimeTableDto;
import com.spring.schoolmngtbackend.implementation.TimeTableImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TimeTable")
@CrossOrigin("*")
public class TimeTableController {

    private TimeTableImpl timeTableService;

    public TimeTableController(TimeTableImpl timeTableService) {
        this.timeTableService = timeTableService;
    }

    @GetMapping("/{id}")
    public Optional<TimeTable> getById(@PathVariable long id) {
        return timeTableService.getById(id);
    }

    @GetMapping
    public List<TimeTable> getAll() {
        return timeTableService.getAll();
    }

   @PostMapping
    public TimeTable create(@RequestBody TimeTableDto dto) {

        return timeTableService.create(dto);
    }

    @PutMapping
    public TimeTable update(@RequestBody TimeTableDto dto) {
        return timeTableService.update(dto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        timeTableService.delete(id);
    }
}
