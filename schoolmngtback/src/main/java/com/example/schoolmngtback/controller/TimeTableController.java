package com.example.schoolmngtback.controller;

import com.example.schoolmngtback.bean.TimeTable;
import com.example.schoolmngtback.implementation.TimeTableImpl;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.time.LocalTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/TimeTable")
@CrossOrigin("*")
@AllArgsConstructor
public class TimeTableController {

    private TimeTableImpl timeTableService;


    @GetMapping("/{id}")
    public Optional<TimeTable> getById(@PathVariable long id) {
        return timeTableService.getById(id);
    }

    @GetMapping
    public List<TimeTable> getAll() {
        return timeTableService.getAll();
    }

   @PostMapping
    public TimeTable create(@RequestBody TimeTable timeTable) {
        timeTable.setStartTime(LocalTime.now());
        timeTable.setEndTime(timeTable.getStartTime().plusHours(2));
        return timeTableService.create(timeTable);
    }

    @PutMapping("/{id}")
    public TimeTable update(@RequestBody TimeTable timeTable, @PathVariable long id) {
        return timeTableService.update(timeTable, id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable long id) {
        timeTableService.delete(id);
    }
}
