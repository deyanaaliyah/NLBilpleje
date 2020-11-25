package com.example.demo.model.services;

public class MediumCar {

    private int insideMediumCar;
    private int outsideMediumCar;
    private int silverMediumCar;
    private int goldMediumCar;

    public MediumCar(int insideMediumCar, int outsideMediumCar, int silverMediumCar, int goldMediumCar) {
        this.insideMediumCar = insideMediumCar;
        this.outsideMediumCar = outsideMediumCar;
        this.silverMediumCar = silverMediumCar;
        this.goldMediumCar = goldMediumCar;
    }
    public MediumCar(){}

    public int getInsideMediumCar() {
        return insideMediumCar;
    }

    public void setInsideMediumCar(int insideMediumCar) {
        this.insideMediumCar = insideMediumCar;
    }

    public int getOutsideMediumCar() {
        return outsideMediumCar;
    }

    public void setOutsideMediumCar(int outsideMediumCar) {
        this.outsideMediumCar = outsideMediumCar;
    }

    public int getSilverMediumCar() {
        return silverMediumCar;
    }

    public void setSilverMediumCar(int silverMediumCar) {
        this.silverMediumCar = silverMediumCar;
    }

    public int getGoldMediumCar() {
        return goldMediumCar;
    }

    public void setGoldMediumCar(int goldMediumCar) {
        this.goldMediumCar = goldMediumCar;
    }
}
