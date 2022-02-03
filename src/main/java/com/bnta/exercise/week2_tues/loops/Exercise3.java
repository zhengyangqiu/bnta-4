package com.bnta.exercise.week2_tues.loops;

public class Exercise3 {
    public static void main(String[] args) {

        // create a for loop which goes from 0 to 20
        // print each even value

        for (int i = 0; i < 21 ; i=i+2) {
            if (i==0){
                continue;
            }
            System.out.println(i);
        }


    }
}
