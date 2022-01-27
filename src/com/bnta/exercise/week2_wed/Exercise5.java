package com.bnta.exercise.week2_wed;
import java.time.LocalDate;

public class Exercise5 {
    public static void main(String[] args) {
        // write a method that calculate age on any given date

        System.out.println(calculateAge(LocalDate.of(2000,01,01)));
    }

    public static int calculateAge(LocalDate date) {


        LocalDate localDate = LocalDate.now();
        LocalDate newDate=date;
        if (localDate.getYear()-date.getYear()>0){
            return localDate.getYear()-date.getYear();
        }else{
            return -1;
        }


        // hint: subtract todays date[year] - date[year]

    }




}
