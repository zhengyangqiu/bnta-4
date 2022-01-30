package com.bnta.exercise.week2_tues.methods;

import org.w3c.dom.ls.LSOutput;

public class Exercise6 {

    //Write a method which takes an array of strings as an argument and returns the number of items in the array.

    public static void main(String[] args) {

        String[] strings= {"a","b","c"};

        System.out.println(num(strings));


    }

    public static int num(String[] str){
        int num = 0;
        for (int i = 0; i < str.length; i++) {
            num+=1;
        }
        return num;


    }
    


}
