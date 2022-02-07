package com.bnta.exercise.week3_mon.students;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Student student = new Student(1,"yang",20);

        Class theClass = new Class("Java",20);

        TheClassService service= new TheClassService();
        service.enrol(student,theClass);


        System.out.println(Arrays.toString(theClass.getStudents()));


    }
}
