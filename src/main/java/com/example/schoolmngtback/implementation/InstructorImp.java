package com.example.schoolmngtback.implementation;

import com.example.schoolmngtback.bean.Instructor;

import com.example.schoolmngtback.repo.InstructorRepo;
import com.example.schoolmngtback.service.AllServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class InstructorImp implements AllServices<Instructor> {
    private InstructorRepo instructorRepo;

    @Override
    public Optional<Instructor> getById(long id) {
        return instructorRepo.findById(id);
    }

    @Override
    public List<Instructor> getAll() {
        return instructorRepo.findAll();
    }

    @Override
    public Instructor create(Instructor entity) {
        return instructorRepo.save(entity);
    }

    @Override
    public Instructor update(Instructor entity ,long id) {
        return instructorRepo.save(entity);
    }

    @Override
    public void delete(long id) {
        instructorRepo.deleteById(id);
    }

    public Instructor getInstructorByUsername(String username) {
        return instructorRepo.findByUsername(username);
    }
}
