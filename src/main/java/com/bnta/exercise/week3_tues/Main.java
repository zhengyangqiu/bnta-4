package com.bnta.exercise.week3_tues;

import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        //throws IOException is there because FileReader() class
        //has a throw IOException built into it therefore we can either throw it or deal with it, in this case, we are
        //throwing it

        File file = new File("./src/main/java/com/bnta/exercise/week3_tues/data.txt");
        Scanner scan = new Scanner(file);

        while(scan.hasNext()){

            System.out.println(scan.nextLine());

        }
        scan.close();



    }





}
