package com.bnta.exercise.week2_tues.methods;

public class Exercise4 {
    public static void main(String[] args) {
        compare(2,2);
        compare(1,2);
        compare(3,2);

    }


    public static void compare(int a,int b){
        if (a>b){
            System.out.println("The first number is larger");
        }else if (a<b){
            System.out.println("The second number is larger");
        }else{
            System.out.println("The numbers are equal");
        }

    }
}
