package com.example.schoolmngtback.repo;

import com.example.schoolmngtback.bean.ERole;
import com.example.schoolmngtback.bean.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role , Long> {
    Optional<Role> findByName(ERole name);
}
