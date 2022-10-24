package com.example.schoolmngtback.implementation;

import com.example.schoolmngtback.bean.ClassRoom;

import com.example.schoolmngtback.repo.ClassRoomRepo;
import com.example.schoolmngtback.service.AllServices;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class ClassRoomImpl implements AllServices<ClassRoom> {
    private ClassRoomRepo classRoomRepo;

    @Override
    public Optional<ClassRoom> getById(long id) {
        return classRoomRepo.findById(id);
    }

    @Override
    public List<ClassRoom> getAll() {
        return classRoomRepo.findAll();
    }

    @Override
    public ClassRoom create(ClassRoom entity) {
        return classRoomRepo.save(entity);
    }

    @Override
    public ClassRoom update(ClassRoom entity, long id) {
        return classRoomRepo.save(entity);
    }

    @Override
    public void delete(long id) {
        classRoomRepo.deleteById(id);
    }
}
