package com.example.schoolmngtback.service;

import java.util.List;
import java.util.Optional;

public interface AllServices <E>{
    public Optional<E> getById(long id);

    public List<E> getAll();

    public E create(E entity);

    public E update(E entity , long id);

    public void delete(long id);
}
