package com.bnta.exercise.week4_wed.interfaces;

public class ElectricScooter implements Vehicle{


    @Override
    public void move() {
        System.out.println("push off");
        System.out.println("press the button");

    }

    @Override
    public void applyBrake() {

    }

    @Override
    public double getCurrentSpeed() {
        return 0;

    }
}
