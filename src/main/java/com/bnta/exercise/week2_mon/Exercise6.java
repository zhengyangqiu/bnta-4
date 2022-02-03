package com.bnta.exercise.week2_mon;

import com.bnta.exercise.week2_mon.email.ValidateEmail;

import static com.bnta.exercise.week2_mon.email.ValidateEmail.email;

public class Exercise6 {
    /*
        Create a package called email
        Then have a method called validateEmail that return true of false if input is valid email
        Finally invoke validateEmail in main
            i.e. "hello@gmail.com" -> true
            i.e. "hellogmail.com" -> false
    */
    public static void main(String[] args) {
        System.out.println(ValidateEmail.validateEmail("hellogmail.com"));

        System.out.println(ValidateEmail.validateEmail(email[2]));




    }



}
