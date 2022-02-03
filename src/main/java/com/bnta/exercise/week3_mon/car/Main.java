package com.bnta.exercise.week3_mon.car;

public class Main {
    public static void main(String[] args) {
        Car car= new Car();


        car.setEngineType(EngineType.PETROL);
        System.out.println(car.getEngineType());

        for (EngineType value : EngineType.values()) {
            System.out.println(value);

        }




    }

}
