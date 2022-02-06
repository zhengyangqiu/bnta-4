package com.bnta.exercise.week3_mon.car;

public class Main {
    public static void main(String[] args) {

        Car car= new Car();
        car.setEngineType(EngineType.PETROL);
        System.out.println(car.getEngineType());

        for (EngineType value : EngineType.values()) {
            System.out.println(value);

        }

        Car carOne = new Car("tesla",50,EngineType.PETROL);
        Car carTwo = new Car("bmw",300,EngineType.ELECTRIC);

        CarDealership dealershipOne = new CarDealership("car",5);
        System.out.println(carOne.toString());
        DealershipService dealershipService=new DealershipService();
        dealershipService.addCar(dealershipOne,carOne);
        dealershipService.addCar(dealershipOne,carTwo);
        dealershipService.addCar(dealershipOne,carOne);
        System.out.println(dealershipService.countCar(dealershipOne));

        System.out.println(dealershipService.findCarByManufacturer("bmw",dealershipOne));


    }





}
