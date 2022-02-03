package com.bnta.exercise.week2_mon;

public class Exercise2 {
    /*
      Given the following String input
      String input = "   b ri   ght net   work  "
      Write a program that transforms input into: Bright Network
    */
    public static void main(String[] args) {
        String input = "   b ri   ght net   work  ";
        String string =input.replace(" ","" );
        String string2 =string.replace("tn","t N");
        string2 = string2.replaceFirst("b","B");
        System.out.println(string2.trim());

    }


}





