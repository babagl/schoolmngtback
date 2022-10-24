package com.example.schoolmngtback.repo;

import com.example.schoolmngtback.bean.Students;

import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Students, Long> {
    Students findByUsername(String username);
}
