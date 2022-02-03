package com.bnta.exercise.week2_mon;

import java.util.ArrayList;

public class Exercise7 {
    /*
        Write a method that finds the longest string in any given array.
        i.e. [] -> ""
        i.e. ["hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "hello", "ola", "bye", "ciao"] -> hello
        i.e. ["hello", "bingo", "ola", "bye", "ciao"] -> hello, bingo biiii
    */
    public static void main(String[] args) {
        String[] array={"www","ola","hello", "bingo", "ola", "bye", "ciao"};
        findString(array);

    }
    public static void findString(String[] array){
        String longest="";
        String result="";

//        ArrayList<String> longest = new ArrayList<String>();

        for (int i = 0; i < array.length; i++) {
            if (array[i].length()>longest.length()){
                longest=array[i];

            }else if(array[i].length()==longest.length()){
                System.out.println("");//pass

            }
        }


        System.out.println(longest);
    }
}

