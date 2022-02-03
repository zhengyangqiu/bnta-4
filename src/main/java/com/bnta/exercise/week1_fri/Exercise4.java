package com.bnta.exercise.week1_fri;

public class Exercise4 {

    /*
           Write a program that adds total amount for this string "0.90, 1.00, 9.00, 8.78, 0.01".

           Tip:
            - String input = "0.90, 1.00, 9.00, 8.78, 0.01";
            - create variable to store result. double result = 0;
            - convert string to array.
            - then loop.
            - convert each string to decimal and add to current result
        */
    public static void main(String[] args) {

        String input="0.90, 1.00, 9.00, 8.78, 0.01";
        double result = 0;
        String [] ary=input.split(",");

        for (int i = 0; i < ary.length; i++) {

            Double decimal=Double.parseDouble(ary[i]);
            result+=decimal;

        }
        System.out.println(result);

    }
}
