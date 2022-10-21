package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Staff;
import com.spring.schoolmngtbackend.dto.StaffDto;
import com.spring.schoolmngtbackend.mapper.StaffMapper;
import com.spring.schoolmngtbackend.repo.StaffRepo;
import com.spring.schoolmngtbackend.service.AllServices;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class StaffImpl implements AllServices<Staff, StaffDto> {
    private StaffRepo staffRepo;
    private StaffMapper staffMapper;

    public StaffImpl(StaffRepo staffRepo, StaffMapper staffMapper) {
        this.staffRepo = staffRepo;
        this.staffMapper = staffMapper;
    }

    @Override
    public Optional<Staff> getById(long id) {
        return staffRepo.findById(id);
    }

    @Override
    public List<Staff> getAll() {
        return staffRepo.findAll();
    }

    @Override
    public Staff create(StaffDto dto) {
        Staff staff = staffMapper.toEntity(dto);
        return staffRepo.save(staff);
    }

    @Override
    public Staff update(StaffDto dto) {
        Staff staff = staffMapper.toEntity(dto);
        staff.setIdStaff(dto.getIdStaff());
        return staffRepo.save(staff);
    }

    @Override
    public void delete(long id) {
        staffRepo.deleteById(id);
    }

    public Staff getStaffByUsername(String username){
        return staffRepo.findByUsername(username);
    }
}
