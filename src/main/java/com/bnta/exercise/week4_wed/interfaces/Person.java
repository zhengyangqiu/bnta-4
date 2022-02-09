package com.bnta.exercise.week4_wed.interfaces;

import java.util.List;

public class Person {

    private String name;
    private List<Vehicle> vehincles;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Vehicle> getVehincles() {
        return vehincles;
    }

    public void setVehincles(List<Vehicle> vehincles) {
        this.vehincles = vehincles;
    }

    //    private List<Car>car;
//    private List<Bicycle>bicycles;
//    private List<ElectricScooter>electricScooters;

}
