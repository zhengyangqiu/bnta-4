package com.bnta.exercise.week2_mon;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Exercise5 {
    /*
        Write a method that displays random joke to the user.
        Your program should stop displaying jokes when use inputs no.
        For e.g
        Want to hear a joke? Yes/No
            if yes then display joke and repeat same question
            if no then program should exit
    */
    public static void main(String[] args) {

        String [] jokesList={
                "hhhhhhh",
                "it is a joke",
                "hahahaha"

        };

        joke();
    }
    public static void joke(){
        Random rand= new Random();
        String [] jokesList={
                "hhhhhhh",
                "it is a joke",
                "hahahaha"

        };
        while(true){
            int n = rand.nextInt(jokesList.length);
            System.out.println("want to hear a joke? Yes/No");
            Scanner scanner=new Scanner(System.in);
            String str = scanner.nextLine();
            if (str.toLowerCase().equals("yes")){
                System.out.println(jokesList[n]);
            }else if (str.toLowerCase().equals("no")){
                System.out.println("finish");
                break;
            }else{
                System.out.println("please enter an volid answer");
            }
        }

    }

}


