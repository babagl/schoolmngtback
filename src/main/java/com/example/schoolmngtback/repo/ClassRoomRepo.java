package com.spring.schoolmngtbackend.repo;

import com.spring.schoolmngtbackend.bean.ClassRoom;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassRoomRepo extends JpaRepository<ClassRoom, Long> {
    ClassRoom findByClassName(String className);
}
