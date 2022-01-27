package com.bnta.exercise.week2_wed;

import java.time.LocalDate;

public class Exercise7 {

    public static void main(String[] args) {
        sums();
    }

    // create a method that sums days of the month for a given array of LocalDate


    public static void sums(){
        LocalDate localDate=LocalDate.now();
        System.out.println(localDate);
        int sum=0;
        int day = localDate.getDayOfMonth();

        for (int i = 0; i < day; i++) {
            sum+=day;

        }
        System.out.println(sum);












    }


}
