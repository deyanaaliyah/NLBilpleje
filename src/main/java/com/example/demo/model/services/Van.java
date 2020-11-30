package com.example.demo.model.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// "@Entity" is a statement to create a table
@Entity
public class Van {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private int insideVanCar;
    private int outsideVanCar;
    private int silverVanCar;
    private int goldVanCar;

    public Van(int insideVanCar, int outsideVanCar, int silverVanCar, int goldVanCar) {
        this.insideVanCar = insideVanCar;
        this.outsideVanCar = outsideVanCar;
        this.silverVanCar = silverVanCar;
        this.goldVanCar = goldVanCar;
    }

    public Van() {
    }

    public int getInsideVanCar() {
        return insideVanCar;
    }

    public void setInsideVanCar(int insideVanCar) {
        this.insideVanCar = insideVanCar;
    }

    public int getOutsideVanCar() {
        return outsideVanCar;
    }

    public void setOutsideVanCar(int outsideVanCar) {
        this.outsideVanCar = outsideVanCar;
    }

    public int getSilverVanCar() {
        return silverVanCar;
    }

    public void setSilverVanCar(int silverVanCar) {
        this.silverVanCar = silverVanCar;
    }

    public int getGoldVanCar() {
        return goldVanCar;
    }

    public void setGoldVanCar(int goldVanCar) {
        this.goldVanCar = goldVanCar;
    }

    @Override
    public String toString() {
        return "Van{" +
                "insideVanCar=" + insideVanCar +
                ", outsideVanCar=" + outsideVanCar +
                ", silverVanCar=" + silverVanCar +
                ", goldVanCar=" + goldVanCar +
                '}';
    }
}
