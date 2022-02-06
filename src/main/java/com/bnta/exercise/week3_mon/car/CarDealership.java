package com.bnta.exercise.week3_mon.car;

import java.util.Arrays;
import java.util.Objects;

public class CarDealership {
    private String name;
    private int capability;
    private Car[] carsInStock;

    public CarDealership() {
    }

    public CarDealership(String name, int capability) {
        this.name = name;
        this.capability = capability;
        this.carsInStock = new Car[capability];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapability() {
        return capability;
    }

    public void setCapability(int capability) {
        this.capability = capability;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void setCarsInStock(Car[] carsInStock) {
        this.carsInStock = carsInStock;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarDealership that = (CarDealership) o;
        return capability == that.capability && name.equals(that.name) && Arrays.equals(carsInStock, that.carsInStock);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(name, capability);
        result = 31 * result + Arrays.hashCode(carsInStock);
        return result;
    }

    @Override
    public String toString() {
        return "CarlDealership{" +
                "name='" + name + '\'' +
                ", capability=" + capability +
                ", carsInStock=" + Arrays.toString(carsInStock) +
                '}';
    }





}
