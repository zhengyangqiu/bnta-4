package com.bnta.exercise.week2_tues.methods;

public class Exercise5 {

    //Write a method which takes a string as an argument, capitalises the first letter and returns the capitalised string.
    //
    //HINT: The .toUpperCase() method will capitalise the whole string. Investigate how to split the first
    // letter from the string, capitalise that, then join the pieces back together
    public static void main(String[] args) {
        //call method here and store result in variable
        //print variable
        String result= capitalisedFirstletter("hello");
        System.out.println(result);


    }
    //write method here
    //pseudocode - plain english description of what the code will do

    //Method signature-takes string as argument,return string
    public static String capitalisedFirstletter(String inputString){
        //capitalise the first letter of inputString
        return inputString.substring(0,1).toUpperCase()+inputString.substring(1);

        //return the modified String


    }



}
