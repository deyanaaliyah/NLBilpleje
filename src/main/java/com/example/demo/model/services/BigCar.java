package com.example.demo.model.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// "@Entity" is a statement to create a table
@Entity
public class BigCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int insideBigCar;
    private int outsideBigCar;
    private int silverBigCar;
    private int goldBigCar;

    public BigCar(int insideBigCar, int outsideBigCar, int silverBigCar, int goldBigCar) {
        this.insideBigCar = insideBigCar;
        this.outsideBigCar = outsideBigCar;
        this.silverBigCar = silverBigCar;
        this.goldBigCar = goldBigCar;
    }

    public BigCar(){}

    public int getInsideBigCar() {
        return insideBigCar;
    }

    public void setInsideBigCar(int insideBigCar) {
        this.insideBigCar = insideBigCar;
    }

    public int getOutsideBigCar() {
        return outsideBigCar;
    }

    public void setOutsideBigCar(int outsideBigCar) {
        this.outsideBigCar = outsideBigCar;
    }

    public int getSilverBigCar() {
        return silverBigCar;
    }

    public void setSilverBigCar(int silverBigCar) {
        this.silverBigCar = silverBigCar;
    }

    public int getGoldBigCar() {
        return goldBigCar;
    }

    public void setGoldBigCar(int goldBigCar) {
        this.goldBigCar = goldBigCar;
    }

    @Override
    public String toString() {
        return "BigCar{" +
                "insideBigCar=" + insideBigCar +
                ", outsideBigCar=" + outsideBigCar +
                ", silverBigCar=" + silverBigCar +
                ", goldBigCar=" + goldBigCar +
                '}';
    }
}