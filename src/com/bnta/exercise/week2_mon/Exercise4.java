package com.bnta.exercise.week2_mon;

import java.util.Scanner;

public class Exercise4 {
    /*
      Write a program that takes an input number from the console and prints if number is prime
      Create a method to check if number is prime then use against the input
    */
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        Integer input=scanner.nextInt();
        primeOrNot(input);

    }
    public static void primeOrNot(int input){
        if (input ==0 || input==1){
            System.out.println("it is not a prime number");
        }else{
            for (int i = 2; i <= input/2 ; i++) {
                if (input%i==0){
                    System.out.println(input+"it is not a prime number");
                    break;
                }

            }
            System.out.println(input+"it is a prime number");
        }

    }

}


