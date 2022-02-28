package com.bnta.exercise.week5_mon.lambda.course1;

public class Demo {

    public static void main(String[] args) {

        //write a method then get lambda expression
        //if have mutilple line, then need curly bracket

        aBlockOfCode = () -> System.out.println("Hello world");

        //it is invalid to specify the return keywork when have a one-liner lambda expression without {}

        doubleNumberFunction= (int a )-> a *2;

        addFunction = (int a, int b) -> a+ b;

        safeDivideFunction = (int a , int b) -> {
            if (b==0) return 0;
            return a/b;

        };




    }

}
