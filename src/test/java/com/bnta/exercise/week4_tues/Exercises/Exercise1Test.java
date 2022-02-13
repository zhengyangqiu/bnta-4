package com.bnta.exercise.week4_tues.Exercises;

import org.assertj.core.api.ThrowableAssert;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class Exercise1Test {
    @Test
    void canFindOutTwoMostOccurrenceKey() {
        //GIVEN
        Exercise1 exercise1= new Exercise1();
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,7,8,8"};
        //WHEN
        List actual = Exercise1.getKey(input);

        //THEN
        List<String> expect = new ArrayList<String>();
        expect.add("1");
        expect.add("7");
        assertThat(actual).isEqualTo(expect);

    }

    @Test
    void canFindOutOneMostOccurrenceKey() {
        //GIVEN
        Exercise1 exercise1= new Exercise1();
        String[] input = {"1,1,1,3,4,5,6,7,7,7,7,8,8"};
        //WHEN
        List actual = Exercise1.getKey(input);

        //THEN
        List<String> expect = new ArrayList<String>();
        expect.add("7");
        assertThat(actual).isEqualTo(expect);

    }

    @Test
    void canHandleNullInTheString() {
        //GIVEN
        Exercise1 exercise1= new Exercise1();
        String[] input = {"1,1,null,3,4,5,6,7,7,7,7,8,8"};
        //WHEN
        List actual = Exercise1.getKey(input);

        //THEN
        List<String> expect = new ArrayList<String>();
        expect.add("7");
        assertThat(actual).isEqualTo(expect);

    }

    @Test
    void canHandleNullInput() {
        //GIVEN
        Exercise1 exercise1= new Exercise1();
        String[] input = null;
        //WHEN
        //THEN

        assertThatThrownBy(()->{exercise1.getKey(input);}).hasMessage("input is null");

    }

    @Test
    void canHandleEmptyWhiteSpace() {
        //GIVEN
        Exercise1 exercise1= new Exercise1();
        String[] input = {"1,1, ,3, ,5,6,7,7,7,7,8,8"};
        //WHEN
        List<String> actual = exercise1.getKey(input);
        //THEN
        List<String> expected = new ArrayList<String>();
        expected.add("7");

        assertThat(actual).isEqualTo(expected);


    }











}