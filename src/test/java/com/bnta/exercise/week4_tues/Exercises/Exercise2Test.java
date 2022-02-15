package com.bnta.exercise.week4_tues.Exercises;

import org.junit.jupiter.api.Test;

import javax.swing.*;
import java.util.HashMap;
import java.util.Map;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class Exercise2Test {

    @Test
    void inputAsSortedNormalStringArray() {

        //GIVEN
        Exercise2 exercise2= new Exercise2();
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,8,8"};
        //WHEN

        Map<String,Integer > expect =exercise2.occurrences(input);

        //THEN
        Map<String , Integer> result = new HashMap<String, Integer>();
        result.put("1",4);
        result.put("3",1);
        result.put("4",1);
        result.put("5",1);
        result.put("6",1);
        result.put("7",3);
        result.put("8",2);
        assertThat(expect).isEqualTo(result);


    }

    @Test
    void inputAsSortedEmptyStringArray() {

        //GIVEN
        Exercise2 exercise2= new Exercise2();
        String[] input = {""};
        //WHEN

        Map<String,Integer> expect =exercise2.occurrences(input);

        //THEN
        Map<String , Integer> result = new HashMap<String, Integer>();
        result.put("",1);

        assertThat(expect).isEqualTo(result);
    }

    @Test
    void inputUnsortedStringArray() {

        //GIVEN
        Exercise2 exercise2 = new Exercise2();
        String[] input = {"1,3,1,7,3,4,5,6,7,1,7,8,3"};
        //WHEN
        Map<String, Integer> expect = exercise2.occurrences(input);
        //THEN
        Map<String, Integer> result = new HashMap<String, Integer>();
        result.put("1", 3);
        result.put("3", 3);
        result.put("4", 1);
        result.put("5", 1);
        result.put("6", 1);
        result.put("7", 3);
        result.put("8", 1);
        assertThat(expect).isEqualTo(result);
    }






}