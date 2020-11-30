package com.example.demo.repository.services;

import com.example.demo.model.services.BigCar;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Dejan
public class BigCarRepository implements CrudRepository<BigCar,Long> {
    @Override
    public <S extends BigCar> S save(S s) {
        return null;
    }

    @Override
    public <S extends BigCar> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<BigCar> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<BigCar> findAll() {
        return null;
    }

    @Override
    public Iterable<BigCar> findAllById(Iterable<Long> iterable) {
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
    public void delete(BigCar bigCar) {

    }

    @Override
    public void deleteAll(Iterable<? extends BigCar> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
