package com.example.demo.repository.services;

import com.example.demo.model.services.Van;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Oliver
public class VanRepository implements CrudRepository<Van,Long> {
    @Override
    public <S extends Van> S save(S s) {
        return null;
    }

    @Override
    public <S extends Van> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Van> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Van> findAll() {
        return null;
    }

    @Override
    public Iterable<Van> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long aLong) {

    }

    @Override
    public void delete(Van van) {

    }

    @Override
    public void deleteAll(Iterable<? extends Van> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
