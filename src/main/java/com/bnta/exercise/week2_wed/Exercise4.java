package com.bnta.exercise.week2_wed;

import java.time.LocalDate;

public class Exercise4 {
    public static void main(String[] args) {

        // 1 - Print todays Date and Time using LocalDate
        // 2 - Represent your date of birth using LocalDate
        // 3 - Add 100 days to your dob and print it

        LocalDate localDate= LocalDate.now();
        System.out.println(localDate);
        LocalDate birthday=LocalDate.of(1996,03,18);
        System.out.println(birthday);
        LocalDate add100=birthday.plusDays(100);
        System.out.println(add100);

    }
}
