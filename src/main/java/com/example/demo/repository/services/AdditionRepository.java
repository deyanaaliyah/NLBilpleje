package com.example.demo.repository.services;

import com.example.demo.model.services.Additions;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

//Dejan
public class AdditionRepository implements CrudRepository<Additions,Long> {
    @Override
    public <S extends Additions> S save(S s) {
        return null;
    }

    @Override
    public <S extends Additions> Iterable<S> saveAll(Iterable<S> iterable) {
        return null;
    }

    @Override
    public Optional<Additions> findById(Long l) {
        return Optional.empty();
    }

    @Override
    public boolean existsById(Long aLong) {
        return false;
    }


    @Override
    public Iterable<Additions> findAll() {
        return null;
    }

    @Override
    public Iterable<Additions> findAllById(Iterable<Long> iterable) {
        return null;
    }

    @Override
    public long count() {
        return 0;
    }

    @Override
    public void deleteById(Long l) {

    }

    @Override
    public void delete(Additions additions) {

    }

    @Override
    public void deleteAll(Iterable<? extends Additions> iterable) {

    }

    @Override
    public void deleteAll() {

    }
}
