package com.bnta.exercise.week2_tues.loops;

import java.util.Arrays;

public class Exercise7 {
    public static void main(String[] args) {

        // create a for loop which goes through each string in our array
        // make each word uppercase
        // assign the value in the array to the uppercase string
        // print our resulting array

        String [] arrString={"i", "sure", "do", "love", "bees"};

        for (int i = 0; i < arrString.length; i++) {
            arrString[i]=arrString[i].toUpperCase();

        }
        System.out.println(Arrays.toString(arrString));



        }


    }



