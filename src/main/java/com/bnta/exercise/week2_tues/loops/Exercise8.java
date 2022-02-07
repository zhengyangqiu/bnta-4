package com.bnta.exercise.week2_tues.loops;

import java.util.Arrays;

public class Exercise8 {
    // create a for loop which goes through each string in our array
    // grab the first letter of our word
    // capitalise the first letter
    // add the capitalised letter to the rest of the provided word
    // assign the value to an array
    // print our resulting array

    public static void main(String[] args) {

        String[] arr={"i", "sure", "do", "love", "bees"};
        String[] arr2=new String[arr.length];


        for (int i = 0; i < arr.length; i++) {
            String s=arr[i].substring(0,1).toUpperCase()+arr[i].substring(1);
            arr2[i]=s;

        }

        System.out.println(Arrays.toString(arr2));


    }
}
