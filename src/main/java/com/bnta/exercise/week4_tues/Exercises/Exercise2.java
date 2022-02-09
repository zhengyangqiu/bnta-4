package com.bnta.exercise.week4_tues.Exercises;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Exercise2 {
    public static void main(String[] args) {
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,8,8"};
        String[] input2 = {};
        System.out.println(Arrays.toString(input2));

        System.out.println(occurrences(input));
        System.out.println(occurrences(input2));

    }

    public static Map occurrences(String[]input){
       if (input.length==0){
           return Collections.emptyMap();
       }

        String str=input[0];
        String[] Arr= str.split(",");
        Arrays.sort(Arr);
        HashMap<String, Integer> map = new HashMap<String,Integer>();
        int count =1;
        for (String s : Arr) {
            if (map.containsKey(s)){
                map.put(s,++count);
            }else{
                count=1;
                map.put(s,count);
            }
        }
        return map;

    }
    //Given the following array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
    //Find the number of occurences for each element
    //Your method should return something like the following:
    //
    //
    //{
    //    "1": 4,
    //    "3": 1,
    //    "4": 1,
    //    "5": 1,
    //    "6": 1,
    //    "7": 3,
    //    "8": 2
    //}
    //Think about the data structure that you should use
    //
    //Create a method. Think about the return type and parameters
    //Write unit tests for your method



}
