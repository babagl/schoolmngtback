package com.example.schoolmngtback.repo;

import com.example.schoolmngtback.bean.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepo extends JpaRepository<TimeTable, Long> {

}
