package com.bnta.exercise.week2_tues.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercise3 {
    // create a File object from a text file
    // create a Scanner object from out File object
    // create a loop which checks whether there is still some unused input
    // create a local variable which is assigned to the next line of the input
    // print the line to the console
    public static void main(String[] args) throws FileNotFoundException {

        File file=new File("src/main/java/com/bnta/exercise/week2_tues/scanner/input.txt");
        Scanner scanner=new Scanner(file);
        while(scanner.hasNext()){
            System.out.println(scanner.nextLine());
        }


    }


}
