package com.bnta.exercise.week2_tues.methods;

public class Exercise7 {
    //Write a method which takes a sentence as an argument,
    // counts the number of words in the array and prints "The sentence contains X words".
    public static void main(String[] args) {
        System.out.println("The sentence contains "+countWord("hello")+" words");

    }



    public static int countWord(String str){
        int count=0;
        for (int i = 0; i < str.length(); i++) {
            count+=1;

        }
        return count;
    }
}
