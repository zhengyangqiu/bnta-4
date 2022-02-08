package com.bnta.exercise.week4_tues;

import java.util.Arrays;

public class Exercise1 {

    public static void main(String[] args) {

        //Given the follwing array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        //Find the element that has the most number of occurences
        //Your method should return something like the 1 since it occurs 4 times
        //Think about the datastructure that you should use
        //Create a method. Think about the return type and parameters
        //Write unit tests for your method

        String[]input={"1","1","1","1","3","4","5","6","7","7","7","8","8"};
        Arrays.sort(input); // sort the array from least to largest
        int count =1; //count number
        int max =0; //set max is 0;
        for (int i = 0; i < input.length-1; i++) {
            for (int j = 1; j < input.length; j++) {

                if (input[i].equals(input[j])){
                    count++;

                }else{
                    if (count>max){
                        max=count;
                        count=1;

                        System.out.println(input[max-1]);
                    }
                    count=1;
                }
            }
        }






    }
}
