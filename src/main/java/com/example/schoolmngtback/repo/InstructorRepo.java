package com.spring.schoolmngtbackend.repo;

import com.spring.schoolmngtbackend.bean.Instructor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorRepo extends JpaRepository<Instructor,Long> {
    Instructor findByUsername(String username);

}
