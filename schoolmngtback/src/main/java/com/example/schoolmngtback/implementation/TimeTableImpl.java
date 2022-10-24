package com.example.schoolmngtback.implementation;


import com.example.schoolmngtback.bean.TimeTable;
import com.example.schoolmngtback.repo.TimeTableRepo;
import com.example.schoolmngtback.service.AllServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;


@Service
@Transactional
@AllArgsConstructor
public class TimeTableImpl implements AllServices<TimeTable> {

    private TimeTableRepo timeTableRepo;

    @Override
    public Optional<TimeTable> getById(long id) {
        return timeTableRepo.findById(id);
    }

    @Override
    public List<TimeTable> getAll() {
        return timeTableRepo.findAll();
    }

    @Override
    public TimeTable create(TimeTable entity) {
        return timeTableRepo.save(entity);
    }

    @Override
    public TimeTable update(TimeTable entity , long id) {
        return timeTableRepo.save(entity);
    }

    @Override
    public void delete(long id) {
        timeTableRepo.deleteById(id);
    }
}



