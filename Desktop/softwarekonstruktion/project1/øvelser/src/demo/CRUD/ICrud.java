package demo.CRUD;

import demo.handler.Person;

public interface ICrud {

    public void create(Person personToBeAdded);

    public void read();

    public void update(Person personToBeUpdated);

    public void delete(Person personToDelete);
}
