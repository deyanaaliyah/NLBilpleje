package com.example.demo.model;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

// "@Entity" is a statement to create a table
@Entity
public class Book {

    // Generates an id which is auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // These are the columns
    private String size;
    private String addition;
    private String licensePlate;
    private boolean isCleaned;

    // Getters and setters
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getAddition() {
        return addition;
    }

    public void setAddition(String addition) {
        this.addition = addition;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public boolean isCleaned() {
        return isCleaned;
    }

    public void setCleaned(boolean cleaned) {
        isCleaned = cleaned;
    }

    /*
    public List<Person> getPersonSet() {
        return personSet;
    }

    public void setPersonSet(List<Person> personSet) {
        this.personSet = personSet;
    }

    // This is the relation types
    @OneToMany(mappedBy = "person_id")
    public List<Person> personSet;

     */
}
