package com.bnta.exercise.week2_tues.methods;

public class Exercise3 {
    //Write a method which takes two numbers as arguments, checks if they are the same and returns the appropriate boolean value.
    //
    //You should check both possible outcomes here, i.e. that it returns true when it is supposed to and false when it is supposed to.
    public static void main(String[] args) {
        System.out.println(same(1,1));
        System.out.println(same(2,1));

    }

    public static boolean same(int num1,int num2){
        return num1==num2;

    }


}
