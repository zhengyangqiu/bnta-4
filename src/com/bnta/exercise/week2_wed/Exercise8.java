package com.bnta.exercise.week2_wed;

public class Exercise8 {

    public static void main(String[] args) {

        // run the above code see what error you get
        // then surround it with try catch block and catch the exception that was thrown. Inside catch the catch block print "cannot divide by 0"

        try {
            int result = 10 / 0;

        }catch (ArithmeticException e){
            System.out.println("cannot divide by 0");


        }
    }
}
