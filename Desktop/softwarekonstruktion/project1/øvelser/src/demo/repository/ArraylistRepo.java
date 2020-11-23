package demo.repository;

import demo.CRUD.ICrud;
import demo.handler.Person;

import java.util.ArrayList;
import java.util.List;

public class ArraylistRepo implements ICrud {

    List<Person> personListe = new ArrayList<>();

    @Override
    public void create(Person personToBeAdded) {
        personListe.add(personToBeAdded);
    }

    @Override
    public void read() {
        System.out.println(personListe);
    }

    @Override
    public void update(Person personToBeUpdated) {

    }

    @Override
    public void delete(Person personToDelete) {

    }
}
