package com.example.schoolmngtback.implementation;

import com.example.schoolmngtback.bean.Administrator;
import com.example.schoolmngtback.bean.Users;
import com.example.schoolmngtback.repo.AdministratorRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersImplementation implements UserDetailsService {
    @Autowired
    private AdministratorRepo administratorRepo;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional <Administrator> administrator = administratorRepo.findByUsername(username);

        administrator.orElseThrow(()-> new UsernameNotFoundException("not found :"+username));

        return administrator.map(Users::new).get();
    }
}
