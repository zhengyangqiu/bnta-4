package com.bnta.exercise.week2_tues.scanner;

import java.util.Scanner;

public class Exercise2 {
    // create a Scanner object - remember to import `java.util.Scanner` at the top of your file!
    // create a variable which is assigned to the value passed into the scanner from the terminal
    // make the input string uppercase
    // print this variable
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        String input=scanner.nextLine();
        System.out.println(input.toUpperCase());


    }
}
