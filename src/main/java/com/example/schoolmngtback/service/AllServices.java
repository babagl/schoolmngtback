package com.spring.schoolmngtbackend.service;

import com.spring.schoolmngtbackend.bean.Administrator;
import com.spring.schoolmngtbackend.dto.AdministratorDto;

import java.util.List;
import java.util.Optional;

public interface AllServices <E,D>{
    public Optional<E> getById(long id);

    public List<E> getAll();

    public E create(D dto);

    public E update(D dto);

    public void delete(long id);
}
