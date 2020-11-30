package com.example.demo.model.services;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// "@Entity" is a statement to create a table
@Entity
public class SmallCar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private int insideSmallCar;
    private int outsideSmallCar;
    private int silverSmallCar;
    private int goldSmallCar;

    public SmallCar(int insideSmallCar, int outsideSmallCar, int silverSmallCar, int goldSmallCar) {
        this.insideSmallCar = insideSmallCar;
        this.outsideSmallCar = outsideSmallCar;
        this.silverSmallCar = silverSmallCar;
        this.goldSmallCar = goldSmallCar;
    }

    public SmallCar() {
    }

    public int getInsideSmallCar() {
        return insideSmallCar;
    }

    public void setInsideSmallCar(int insideSmallCar) {
        this.insideSmallCar = insideSmallCar;
    }

    public int getOutsideSmallCar() {
        return outsideSmallCar;
    }

    public void setOutsideSmallCar(int outsideSmallCar) {
        this.outsideSmallCar = outsideSmallCar;
    }

    public int getSilverSmallCar() {
        return silverSmallCar;
    }

    public void setSilverSmallCar(int silverSmallCar) {
        this.silverSmallCar = silverSmallCar;
    }

    public int getGoldSmallCar() {
        return goldSmallCar;
    }

    public void setGoldSmallCar(int goldSmallCar) {
        this.goldSmallCar = goldSmallCar;
    }

    @Override
    public String toString() {
        return "SmallCar{" +
                "insideSmallCar=" + insideSmallCar +
                ", outsideSmallCar=" + outsideSmallCar +
                ", silverSmallCar=" + silverSmallCar +
                ", goldSmallCar=" + goldSmallCar +
                '}';
    }
}
