package com.bnta.exercise.week4_tues.Exercises;

import java.util.*;

public class Exercise1 {

    public static void main(String[] args) {
        String[] input = {"1,1,1,1,3,4,5,6,7,7,7,7,8,8"};

        List result = getKey(input);
        System.out.println(result);
        //split the string by comma
        //map string integer
        //loop through string
        //if map contain key, increase the value by one count=get(key)+1, map.put(key,count)
        //else map.put(key,1)
        //return map
        //max =2 , list[2,3]


        //Given the follwing array of strings. String[] input = "1,1,1,1,3,4,5,6,7,7,7,8,8";
        //Find the element that has the most number of occurences
        //Your method should return something like the 1 since it occurs 4 times
        //Think about the datastructure that you should use
        //Create a method. Think about the return type and parameters
        //Write unit tests for your method

//        String[]input={"1","1","1","1","3","4","5","6","7","7","7","8","8"};
//        Arrays.sort(input); // sort the array from least to largest
//        int count =1; //count number
//        int max =0; //set max is 0;
//        for (int i = 0; i < input.length-1; i++) {
//            for (int j = 1; j < input.length; j++) {
//
//                if (input[i].equals(input[j])){
//                    count++;
//
//                }else{
//                    if (count>max){
//                        max=count;
//                        count=1;
//
//                        System.out.println(input[max-1]);
//                    }
//                    count=1;
//                }
//            }
//        }

    }


    public static List<String> getKey(String[] input){

        if (input == null){
            throw new NullPointerException("input is null");
        }



        String str=input[input.length-1];
        String[] Arr= str.split(",");
        List<String>list= new ArrayList<String>();
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
        int maxValueInMap=Collections.max(map.values());



        for (Map.Entry<String, Integer> stringIntegerEntry : map.entrySet()) {
            if (stringIntegerEntry.getValue()==maxValueInMap){
                 list.add(stringIntegerEntry.getKey());
            }
        }
        return list;

    }

}
