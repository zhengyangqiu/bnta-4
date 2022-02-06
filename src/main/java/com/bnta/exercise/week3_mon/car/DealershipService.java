package com.bnta.exercise.week3_mon.car;

public class DealershipService {

    public void addCar(CarDealership carlDealership, Car car) {
        for (int i = 0; i < carlDealership.getCarsInStock().length; i++) {
            if (carlDealership.getCarsInStock()[i] == null) {
                carlDealership.getCarsInStock()[i] = car;
                break;
            }


        }


    }

    public int countCar(CarDealership carlDealership) {
        int count = 0;
        for (int i = 0; i < carlDealership.getCarsInStock().length; i++) {
            if (carlDealership.getCarsInStock()[i] != null) {
                count++;
            }

        }
        return count;
    }


    public Car findCarByManufacturer(String s,CarDealership carDealership) {

        for (Car car : carDealership.getCarsInStock()) {
            if (s.equals(car.getManufacturer().toString())) {
                return car;

            }

        }
        return null;
    }


}
