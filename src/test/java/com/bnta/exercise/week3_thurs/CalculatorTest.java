package com.bnta.exercise.week3_thurs;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void canAddTwoNumbers() {

        //given
        Calculator calculator = new Calculator();
        int n1 =10;
        int n2 =10;

        //when
        int result = calculator.add(n1,n2);

        //then
        assertThat(result).isEqualTo(20);
    }

    @Test
    void cabDivideNumber() {

        //given

        Calculator calculator=new Calculator();
        int n1=10;
        int n2 =10;

        //when

        int actual = calculator.divide(n1,n2);
        int expected=1;

        //then
        assertThat(actual).isEqualTo(expected);

    }
}