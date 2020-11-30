package com.example.demo.model.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// This class handles the additional fees/services customer desires
// "@Entity" is a statement to create a table
@Entity
public class Additions {

    // Generates an id which is auto incremental
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int dogHair;
    private int oneSeatCleaning;
    private int allSeatsCleaning;
    private int motorWash;
    private int degreasing;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getDogHair() {
        return dogHair;
    }

    public void setDogHair(int dogHair) {
        this.dogHair = dogHair;
    }

    public int getOneSeatCleaning() {
        return oneSeatCleaning;
    }

    public void setOneSeatCleaning(int oneSeatCleaning) {
        this.oneSeatCleaning = oneSeatCleaning;
    }

    public int getAllSeatsCleaning() {
        return allSeatsCleaning;
    }

    public void setAllSeatsCleaning(int allSeatsCleaning) {
        this.allSeatsCleaning = allSeatsCleaning;
    }

    public int getMotorWash() {
        return motorWash;
    }

    public void setMotorWash(int motorWash) {
        this.motorWash = motorWash;
    }

    public int getDegreasing() {
        return degreasing;
    }

    public void setDegreasing(int degreasing) {
        this.degreasing = degreasing;
    }
}