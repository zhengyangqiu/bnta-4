package com.bnta.exercise.week4_tues.Exercises;

import java.util.Stack;

public class Exercise3 {
    //1.split input
    //2.stack<String>stack
    //3.loop if is "c or [ or {" stack.push(bracket), if c
    //

    public static void main(String[] args) {

        String input = "[{{[(){}]}}[]{}{{(())}}]";
        String input2="({[})";
        System.out.println(isBalanced(input));
        System.out.println(isBalanced(input2));
    }
    public static boolean isBalanced(String input) {
        if (input==""){
            return true;
        }
        Stack<String>stack=new Stack<String>();
        String[]arr=input.split("");
        for (String s : arr) {
            if (s.equals("(")||s.equals("[")||s.equals("{")){
                stack.push(s);
            }else if (s.equals(")")||s.equals("]")||s.equals("}")){
                if (stack.peek().equals("(")&&s.equals(")")){
                    stack.pop();
                }else if (stack.peek().equals("[")&&s.equals("]")){
                    stack.pop();
                }else if (stack.peek().equals("{")&&s.equals("}")){
                    stack.pop();
                }else{
                    return false;
                }
            }
        }
        return stack.isEmpty();

    }

    //Given the following inputs
    //
    //
    //String brackets = "[{{[(){}]}}[]{}{{(())}}]";
    //String brackets = "[{{}}[]{}{{(())}}]";
    //String brackets = "[{}{}{{()}}]";
    //String brackets = "[{}{{}}]";
    //String brackets = "[{{}}]";
    //String brackets = "[{}]";
    //String brackets = "";
    //Check if the following parenteshis are balanced. i.e
    //
    //
    //[] - true
    //[[] - false
    //({[]}) - true
    //({[}) - false
    //Think about which data structure you should use, implement the following method and write unit tests
    //
    //
    //




}

