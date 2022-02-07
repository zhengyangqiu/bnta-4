package com.bnta.exercise.week2_tues.arrays;

public class Exercise1 {

    /*
      Write a method that reverses any String and print to console
      Input should be a string
      Output should be reversed input
    */
    public static void main(String[] args) {
        System.out.println(reverse("hello"));

    }

    public static String reverse(String str){
        String newStr="";
        for (int i = str.length()-1; i >= 0 ; i--) {
            newStr+=str.charAt(i);

        }
        return newStr;
    }
}
