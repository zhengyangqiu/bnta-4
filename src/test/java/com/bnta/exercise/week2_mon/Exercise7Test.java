package com.bnta.exercise.week2_mon;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise7Test {

    private Exercise7 underTest;

    @BeforeEach

    void setUp() {
        Exercise7 underTest=new Exercise7();
    }

    @Test
    void itCanReturnLongestString() {

        //GIVEN

        String[] input={"Rogby","Alex","Michelle","Adib"};


        //WHEN
        String actual = underTest.longestWords(input);

        //THEN
        assertThat(actual).isEqualTo("Michelle");



    }


    @Test
    void itCanReturnLongestStringWhenDuplicates() {

        //GIVEN

        String[] input={"Rogby","Alex","Michelle","Adib","Michelle"};


        //WHEN
        String actual = underTest.longestWords(input);

        //THEN
        assertThat(actual).isEqualTo("Michelle");



    }


    @Test
    void itCanTwoReturnLongestStringWhenDuplicates() {

        //GIVEN

        String[] input={"Rogby","Alex","Michelle","Adib","Michelle","Michella","Michellb"};


        //WHEN
        String actual = underTest.longestWords(input);

        //THEN
        assertThat(actual).isEqualTo("Michelle, Michella, Michellb");



    }




}