package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.ClassRoom;
import com.spring.schoolmngtbackend.dto.ClassRoomDto;
import com.spring.schoolmngtbackend.mapper.ClassRoomMapper;
import com.spring.schoolmngtbackend.repo.ClassRoomRepo;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class ClassRoomImpl implements AllServices<ClassRoom, ClassRoomDto> {
    private ClassRoomRepo classRoomRepo;
    private ClassRoomMapper classRoomMapper;

    public ClassRoomImpl(ClassRoomRepo classRoomRepo, ClassRoomMapper classRoomMapper) {
        this.classRoomRepo = classRoomRepo;
        this.classRoomMapper = classRoomMapper;
    }

    @Override
    public Optional<ClassRoom> getById(long id) {
        return classRoomRepo.findById(id);
    }

    @Override
    public List<ClassRoom> getAll() {
        return classRoomRepo.findAll();
    }

    @Override
    public ClassRoom create(ClassRoomDto dto) {
        System.out.println(dto.getClassName()+"dtp added");
        ClassRoom classRoom = classRoomMapper.toEntity(dto);
        System.out.println(classRoom.getClassName()+"...added");
        return classRoomRepo.save(classRoom);
    }

    @Override
    public ClassRoom update(ClassRoomDto dto) {
        ClassRoom classRoom = classRoomMapper.toEntity(dto);
        classRoom.setMatriculeClassroom(dto.getMatriculeClassroom());
        System.out.println(classRoom.getClassName()+"changed");
        return classRoomRepo.save(classRoom);
    }

    @Override
    public void delete(long id) {
        classRoomRepo.deleteById(id);
    }
}
