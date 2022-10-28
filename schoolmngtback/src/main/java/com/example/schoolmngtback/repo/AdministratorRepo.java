package com.example.schoolmngtback.repo;

import com.example.schoolmngtback.bean.Administrator;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface AdministratorRepo extends JpaRepository<Administrator,Long> {
    //Administrator findByUsername(String username);

    Optional<Administrator>findByUsername(String username);
    @Query("select a from Administrator a where a.fullName like :kw")
    List<Administrator> searchAdministrator(@Param(value = "kw") String keyword);

}
