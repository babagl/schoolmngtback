package com.example.schoolmngtback.implementation;


import com.example.schoolmngtback.bean.Students;
import com.example.schoolmngtback.repo.StudentRepo;
import com.example.schoolmngtback.service.AllServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class StudentsImpl implements AllServices<Students> {

    private StudentRepo studentRepo;

    public Students getStudentByUsername(String username){
        return studentRepo.findByUsername(username);
    }

    @Override
    public Optional<Students> getById(long id) {
        return studentRepo.findById(id);
    }

    @Override
    public List<Students> getAll() {
        return studentRepo.findAll();
    }

    @Override
    public Students create(Students entity) {
        return studentRepo.save(entity);
    }

    @Override
    public Students update(Students entity, long id) {
        return studentRepo.save(entity);
    }

    @Override
    public void delete(long id) {
        studentRepo.deleteById(id);

    }
}
