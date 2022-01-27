package com.bnta.exercise.week2_mon.email;

import java.util.Arrays;

public class ValidateEmail {
    public static String[] email={"hello@gmail.com", "hellogmail.com", "he@gmail.com","@gmail.com"};


    public static boolean validateEmail(String emails){


        if (emails.contains("@")&&emails.substring(emails.indexOf("@")).equals("@gmail.com")&&(emails.length()>10)) {

            return true;
        }else{
            return false;

        }


    }



}
