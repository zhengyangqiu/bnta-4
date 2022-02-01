package com.bnta.exercise.week2_tues.loops;

public class Exercise6 {

    public static void main(String[] args) {

        // create a sum variable
        // using your answer from Question 4, create a for loop that goes through the values
        // add each item to the sum value
        // print the total sum

        int sum=0;
        int[]array=new int[10];

        for (int i = 0; i < 10; i++) {
            array[i]=i;
            sum+=array[i];

        }

        System.out.println(sum);




    }
}
