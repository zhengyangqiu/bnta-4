package com.bnta.exercise.week2_tues.scanner;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Tutorial {

    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("/Users/iainsandison/input.txt");
// Create a File object from our text file

        Scanner ourScanner = new Scanner(inputFile);
// Create a Scanner object which takes in our File object

        while(ourScanner.hasNext()) {
// A while loop which checks if there is another line in the text file

            System.out.println("There's another line!");

            String input = ourScanner.nextLine();
            // Note that we need to include a consumption method still to make use of the input

            System.out.println(input);

        }



    }


// There's another line!
// This
// There's another line!
// Is
// There's another line!
// Our
// There's another line!
// Input
// There's another line!
// File


}
