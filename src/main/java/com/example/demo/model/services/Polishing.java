package com.example.demo.model.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// "@Entity" is a statement to create a table
@Entity
public class Polishing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int smallCar;
    private int mediumCar;
    private int bigCar;
    private int van;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSmallCar() {
        return smallCar;
    }

    public void setSmallCar(int smallCar) {
        this.smallCar = smallCar;
    }

    public int getMediumCar() {
        return mediumCar;
    }

    public void setMediumCar(int mediumCar) {
        this.mediumCar = mediumCar;
    }

    public int getBigCar() {
        return bigCar;
    }

    public void setBigCar(int bigCar) {
        this.bigCar = bigCar;
    }

    public int getVan() {
        return van;
    }

    public void setVan(int van) {
        this.van = van;
    }
}
