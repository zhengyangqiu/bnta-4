package com.bnta.exercise.week5_mon.lambda;

public interface Printer {

    //functional interface which only has one abstract method to implement

    void print(String message);

    // it is still a functional interface, because it has a single abstract method

//    default void printTwice(String message){
//        System.out.println(message);
//        System.out.println(message);
//    }

}
