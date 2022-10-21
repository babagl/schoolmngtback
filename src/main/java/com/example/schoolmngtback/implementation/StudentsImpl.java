package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Students;
import com.spring.schoolmngtbackend.dto.StudentDto;
import com.spring.schoolmngtbackend.mapper.StudentMapper;
import com.spring.schoolmngtbackend.repo.StudentRepo;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StudentsImpl implements AllServices<Students, StudentDto> {
    private StudentRepo studentRepo;
    private StudentMapper studentMapper;

    public StudentsImpl(StudentRepo studentRepo) {
        this.studentRepo = studentRepo;
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
    public Students create(StudentDto dto) {
        Students students = studentMapper.toEntity(dto);
        return students;
    }

    @Override
    public Students update(StudentDto dto) {
        Students students = studentMapper.toEntity(dto);
        students.setIdStudent(dto.getIdStudent());
        return students;
    }

    @Override
    public void delete(long id) {
        studentRepo.deleteById(id);
    }

    public Students getStudentByUsername(String username){
        return studentRepo.findByUsername(username);
    }
}
