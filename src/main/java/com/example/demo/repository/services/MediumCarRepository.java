package com.example.demo.repository.services;

import com.example.demo.model.services.MediumCar;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Heritier
public class MediumCarRepository implements CrudRepository<MediumCar,Long> {
    @Override
    public <S extends MediumCar> S save(S s) {
        return null;
    }

    @Override
    public <S extends MediumCar> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<MediumCar> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<MediumCar> findAll() {
        return null;
    }

    @Override
    public Iterable<MediumCar> findAllById(Iterable<Long> iterable) {
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
    public void delete(MediumCar mediumCar) {

    }

    @Override
    public void deleteAll(Iterable<? extends MediumCar> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
