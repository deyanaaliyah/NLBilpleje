package com.example.demo.model;

import javax.persistence.*;

// "@Entity" is a statement to create a table
@Entity
@Table(name = "Bookings")
public class Booking {

    // Generates an id which is auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // These are the columns
    private String size;
    private String addition;
    private String licensePlate;
    private String status;
    private String date;

    public Booking() {
    }
    public Booking(String size, String addition , String licensePlate , String status, String date) {
        this.size = size;
        this.addition = addition;
        this.licensePlate = licensePlate;
        this.status = status;
        this.date = date;
    }

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
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
