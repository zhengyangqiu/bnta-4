package com.bnta.exercise.week5_mon.lambda;

public class ConsolePrinter implements Printer{


    @Override
    public void print(String message) {
        System.out.println(message);
    }
}
