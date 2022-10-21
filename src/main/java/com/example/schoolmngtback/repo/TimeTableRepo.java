package com.spring.schoolmngtbackend.repo;

import com.spring.schoolmngtbackend.bean.TimeTable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TimeTableRepo extends JpaRepository<TimeTable, Long> {

}
