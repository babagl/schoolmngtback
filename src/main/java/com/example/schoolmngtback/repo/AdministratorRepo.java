package com.spring.schoolmngtbackend.repo;

import com.spring.schoolmngtbackend.bean.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdministratorRepo extends JpaRepository<Administrator,Long> {
    Administrator findByUsername(String username);

}
