package com.bnta.exercise.week4_wed.interfaces;

public class Car implements  Vehicle{
    @Override
    public void move() {
        System.out.println("start engine");
        System.out.println("gear");
        System.out.println("accelerate");

    }

    @Override
    public void applyBrake() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;

    }


    //they all have same method but implementation not same

    //wheels




    //move()
    //brake
    //speed()

}
