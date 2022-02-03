package com.bnta.exercise.week2_mon;

import java.util.Scanner;

public class Exercise1 {
    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */

    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        String input=myObj.nextLine();
        StringBuilder input2 = new StringBuilder();
        input2.append(input);
        input2.reverse();

        System.out.println(input2);



    }



}
