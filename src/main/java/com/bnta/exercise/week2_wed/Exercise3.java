package com.bnta.exercise.week2_wed;

import java.util.Arrays;

public class Exercise3 {
    public static void main(String[] args) {
        for (int i = 0; i < ThirstSize.values().length; i++) {
            ThirstSize.values()[i].name().toLowerCase();
            System.out.println(ThirstSize.values()[i].name().toLowerCase());

        }

//        System.out.println(Arrays.toString(ThirstSize.values()));

        }

        // invoke .values() method on ThirstSize enum and loop through its values and while looping lowercase each value
        // hint: while you loop through enums invoke .name() to convert enum to string. without it, you can't lowercase
    }

