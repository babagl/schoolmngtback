package com.example.schoolmngtback.implementation;

import com.example.schoolmngtback.bean.Staff;
import com.example.schoolmngtback.repo.StaffRepo;
import com.example.schoolmngtback.service.AllServices;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
@AllArgsConstructor
public class StaffImpl implements AllServices<Staff> {
    private StaffRepo staffRepo;

    @Override
    public Optional<Staff> getById(long id) {
        return staffRepo.findById(id);
    }

    @Override
    public List<Staff> getAll() {
        return staffRepo.findAll();
    }

    @Override
    public Staff create(Staff entity) {
        return staffRepo.save(entity);
    }

    @Override
    public Staff update(Staff entity, long id) {
        return staffRepo.save(entity);
    }

    @Override
    public void delete(long id) {
        staffRepo.deleteById(id);
    }

    public Staff getStaffByUsername(String username) {
        return staffRepo.findByUsername(username);
    }
}
