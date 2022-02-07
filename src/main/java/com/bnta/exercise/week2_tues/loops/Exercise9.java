package com.bnta.exercise.week2_tues.loops;

public class Exercise9 {
    // create a for loop which goes through number in our array
    // check whether the value is greater than the current greatest value
    // reassign the current greatest value if true
    // print the greatest value


    public static void main(String[] args) {

        int [] arr={1, 6, 17, 9, 20, 5};
        int greatest = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (greatest<arr[i]){
                greatest=arr[i];
            }

        }
        System.out.println(greatest);

    }

}
