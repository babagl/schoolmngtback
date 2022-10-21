package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Instructor;
import com.spring.schoolmngtbackend.dto.InstructorDto;
import com.spring.schoolmngtbackend.mapper.InstructorMapper;
import com.spring.schoolmngtbackend.repo.InstructorRepo;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class InstructorImp implements AllServices<Instructor, InstructorDto> {
    private InstructorRepo instructorRepo;
    private InstructorMapper instructorMapper;

    public InstructorImp(InstructorRepo instructorRepo,InstructorMapper instructorMapper) {
        this.instructorRepo = instructorRepo;
        this.instructorMapper=instructorMapper;
    }

    @Override
    public Optional<Instructor> getById(long id) {
        return instructorRepo.findById(id);
    }

    @Override
    public List<Instructor> getAll() {
        return instructorRepo.findAll();
    }

    @Override
    public Instructor create(InstructorDto dto) {
        Instructor instructor = instructorMapper.toEntity(dto);
        return instructorRepo.save(instructor);
    }

    @Override
    public Instructor update(InstructorDto dto) {
        Instructor instructor = instructorMapper.toEntity(dto);
        instructor.setIdInstructor(dto.getIdInstructor());
        return instructorRepo.save(instructor);
    }

    @Override
    public void delete(long id) {
        instructorRepo.deleteById(id);
    }

    public Instructor getInstructorByUsername(String username){
        System.out.println(instructorRepo.findByUsername(username).getFullName());
        System.out.println(instructorRepo.findByUsername(username).getBirthday());
        return instructorRepo.findByUsername(username);
    }
}
