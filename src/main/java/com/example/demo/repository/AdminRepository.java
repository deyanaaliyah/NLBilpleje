package com.example.demo.repository;

import com.example.demo.model.Admin;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Oliver
public class AdminRepository implements CrudRepository<Admin,Long> {
    @Override
    public <S extends Admin> S save(S s) {
        return null;
    }

    @Override
    public <S extends Admin> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Admin> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Admin> findAll() {
        return null;
    }

    @Override
    public Iterable<Admin> findAllById(Iterable<Long> iterable) {
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
    public void delete(Admin admin) {

    }

    @Override
    public void deleteAll(Iterable<? extends Admin> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
