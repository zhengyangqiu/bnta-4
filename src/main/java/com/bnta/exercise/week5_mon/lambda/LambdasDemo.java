package com.bnta.exercise.week5_mon.lambda;

public class LambdasDemo {

    public static void main(String[] args) {
        greet(new ConsolePrinter());
        
    }


    public static void greet(Printer printer){
        printer.print("Hello World");

    }
}
