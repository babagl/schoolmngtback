package com.spring.schoolmngtbackend.implementation;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;
import com.spring.schoolmngtbackend.mapper.AdministratorMapper;
import com.spring.schoolmngtbackend.repo.AdministratorRepo;
import com.spring.schoolmngtbackend.service.AdministratorService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@Transactional

public class AdminImpl implements AdministratorService {
    private final AdministratorRepo repo;
    private final AdministratorMapper mapper;
    private PasswordEncoder passwordEncoder;

    public AdminImpl(AdministratorRepo repo, AdministratorMapper mapper, PasswordEncoder passwordEncoder) {
        this.repo = repo;
        this.mapper = mapper;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public Optional<Administrator> getById(long id) {
        return repo.findById(id);
    }

    @Override
    public List<Administrator> getAll() {
        return repo.findAll();
    }

    @Override
    public Administrator create(AdministratorDto dto) {
        String pwd = dto.getPassword();
        dto.setPassword(passwordEncoder.encode(pwd));
        Administrator administrator = mapper.toEntity(dto);
        return repo.save(administrator);
    }

    @Override
    public Administrator update(AdministratorDto dto) {
        String pwd = dto.getPassword();
        dto.setPassword(passwordEncoder.encode(pwd));
        Administrator administrator = mapper.toEntity(dto);
        administrator.setIdAdministrator(dto.getIdAdministrator());
        return repo.save(administrator);
    }

    @Override
    public void delete(long id) {
        repo.deleteById(id);
    }

    public Administrator getAdminByUsername(String username){
       return repo.findByUsername(username);
    }
}
