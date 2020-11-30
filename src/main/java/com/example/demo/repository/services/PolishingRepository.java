package com.example.demo.repository.services;

import com.example.demo.model.services.Polishing;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Heritier
public class PolishingRepository implements CrudRepository<Polishing,Long> {
    @Override
    public <S extends Polishing> S save(S s) {
        return null;
    }

    @Override
    public <S extends Polishing> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Polishing> findById(Long aLong) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }

    @Override
    public Iterable<Polishing> findAll() {
        return null;
    }

    @Override
    public Iterable<Polishing> findAllById(Iterable<Long> iterable) {
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
    public void delete(Polishing polishing) {

    }

    @Override
    public void deleteAll(Iterable<? extends Polishing> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
