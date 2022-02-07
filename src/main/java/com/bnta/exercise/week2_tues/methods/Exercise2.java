package com.bnta.exercise.week2_tues.methods;

public class Exercise2 {
    //Write a method which takes a number as an argument and returns that number negated,
    // e.g. passing 5 as an argument should return -5; passing -10 should return 10.
    public static void main(String[] args) {
        System.out.println(negated(10));
        System.out.println(negated(-5));

    }

    public static int negated(int num){
        return -num;
    }

}
