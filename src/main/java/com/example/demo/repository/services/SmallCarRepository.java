package com.example.demo.repository.services;

import com.example.demo.model.services.SmallCar;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Mo
public class SmallCarRepository implements CrudRepository<SmallCar,Long> {
    @Override
    public <S extends SmallCar> S save(S s) {
        return null;
    }

    @Override
    public <S extends SmallCar> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<SmallCar> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<SmallCar> findAll() {
        return null;
    }

    @Override
    public Iterable<SmallCar> findAllById(Iterable<Long> iterable) {
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
    public void delete(SmallCar smallCar) {

    }

    @Override
    public void deleteAll(Iterable<? extends SmallCar> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
