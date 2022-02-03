package com.bnta.exercise.week2_wed;

public class Exercise6 {

    public static void main(String[] args) {
        convert(args);
        // try catch
        // write a program that converts program arguments to an integer
        // if value cannot be converted to int store them somewhere
        // calculate sum for numbers that can be converted to an integer
        // finally print the numbers that cannot be converted to an int
        // example: java com.bnta.exercises.week_two_wed.exercises.Exercise6 1 2 a b foo 3
        // output: Sum: 5 and a, b, foo are not numbers.
    }

    public static void convert(String[] str){
        Integer sum=0;
        String fails="";

        for (int i = 0; i < str.length; i++) {

            try {
                sum+=Integer.parseInt(str[i]);
            }catch (Exception e){
//                System.out.println(str[i]+" is not numbers");
                fails+=str[i]+" is not numbers ";
            }

        }
        System.out.println(fails);
        System.out.println(sum);


    }



}
