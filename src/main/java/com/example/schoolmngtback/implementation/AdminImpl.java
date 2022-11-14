package com.example.schoolmngtback.implementation;

import com.example.schoolmngtback.bean.Administrator;
import com.example.schoolmngtback.bean.User;
import com.example.schoolmngtback.repo.AdministratorRepo;
import com.example.schoolmngtback.repo.UserRepository;
import com.example.schoolmngtback.service.AllServices;

import lombok.AllArgsConstructor;
import org.springframework.format.datetime.DateFormatter;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Optional;

import static java.time.LocalDate.*;

@Service
@Transactional
@AllArgsConstructor
public class AdminImpl implements AllServices<Administrator> {
    private AdministratorRepo administratorRepo;
    private PasswordEncoder passwordEncoder;

    private UserRepository userRepository;



    public User create(User entity) {
        String pwd = entity.getPassword();
        entity.setPassword(passwordEncoder.encode(pwd));
        return userRepository.save(entity);
    }

    @Override
    public Optional<Administrator> getById(long id) {
        return administratorRepo.findById(id);
    }

    @Override
    public List<Administrator> getAll() {
        return administratorRepo.findAll();
    }

    @Override
    public Administrator create(Administrator entity) {
        String pwd = entity.getPassword();
        entity.setPassword(passwordEncoder.encode(pwd));
        return administratorRepo.save(entity);
    }

    @Override
    public Administrator update(Administrator entity, long id) {
        entity.setIdAdministrator(id);
        return administratorRepo.save(entity);
    }

    @Override
    public void delete(long id) {
        administratorRepo.deleteById(id);
    }

    public Optional<Administrator> getAdminByUsername(String username){
        return administratorRepo.findByUsername(username);
    }

    public List<Administrator> searchAdmin(String keyword) {
        List<Administrator> administrators= administratorRepo.searchAdministrator(keyword);
        return administrators;
    }
}
