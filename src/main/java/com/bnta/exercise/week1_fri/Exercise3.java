package com.bnta.exercise.week1_fri;

public class Exercise3 {
    /*
           Write a program that reverses an array of Strings
           String[] content = {"you", "are", "how", "hello"}
           Tip. Use for loop and you to start at highest index.
           Output should be: hello how are you?. Note question mark at the end
       */
    public static void main(String[] args) {
        String[] content={"you","are","how","hello"};
        String output="";
        for (int i=content.length-1;i>=0;i--){
            //System.out.println(content[i]);
            output+=content[i]+" ";



        }
        System.out.println(output.trim()+"?");

    }
}
