package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.TimeTable;
import com.spring.schoolmngtbackend.dto.TimeTableDto;
import com.spring.schoolmngtbackend.mapper.TimeTableMapper;
import com.spring.schoolmngtbackend.repo.TimeTableRepo;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class TimeTableImpl implements AllServices<TimeTable, TimeTableDto> {

    private TimeTableRepo timeTableRepo;
    private TimeTableMapper timeTableMapper;

    public TimeTableImpl(TimeTableRepo timeTableRepo, TimeTableMapper timeTableMapper) {
        this.timeTableRepo = timeTableRepo;
        this.timeTableMapper = timeTableMapper;
    }


    @Override
    public Optional<TimeTable> getById(long id) {
        return timeTableRepo.findById(id);
    }

    @Override
    public List<TimeTable> getAll() {
        return timeTableRepo.findAll();
    }

    @Override
    public TimeTable create(TimeTableDto dto) {
        TimeTable timeTable = timeTableMapper.toEntity(dto);
        return timeTableRepo.save(timeTable);
    }

    @Override
    public TimeTable update(TimeTableDto dto) {
        TimeTable timeTable = timeTableMapper.toEntity(dto);
        timeTable.setIdTimeTable(dto.getIdTimeTable());
        return timeTableRepo.save(timeTable);
    }

    @Override
    public void delete(long id) {
        timeTableRepo.deleteById(id);
    }
}
