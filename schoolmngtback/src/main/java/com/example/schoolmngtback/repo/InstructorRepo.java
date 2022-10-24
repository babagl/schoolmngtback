package com.example.schoolmngtback.repo;

import com.example.schoolmngtback.bean.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor,Long> {
    Instructor findByUsername(String username);

}
