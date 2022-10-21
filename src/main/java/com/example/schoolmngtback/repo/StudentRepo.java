package com.spring.schoolmngtbackend.repo;

import com.spring.schoolmngtbackend.bean.Students;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students, Long> {
    Students findByUsername(String username);
}
