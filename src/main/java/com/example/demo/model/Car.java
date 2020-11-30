package com.example.demo.model;

import javax.persistence.*;

// "@Entity" is a statement to create a table
@Entity
public class Car {

    // Generates an id which is auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // These are the columns
    private String size;
    private String addition;

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

    // This is the relation types
    @ManyToOne
    private Person person;
}
