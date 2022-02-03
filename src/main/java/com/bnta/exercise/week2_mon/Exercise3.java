package com.bnta.exercise.week2_mon;

public class Exercise3 {
    /*
      Write a program that receives numbers as program arguments and prints to console if numbers are even or odd
      You might compile and run the program via command line or by editing configuration and pass program arguments
    */
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) {
            if (Integer.parseInt(args[i])%2==0){
                System.out.println("it is even");
            }else{
                System.out.println("it is odd");
            }

        }

    }

}


