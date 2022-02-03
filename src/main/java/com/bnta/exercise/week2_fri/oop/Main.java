package com.bnta.exercise.week2_fri.oop;

public class Main {
    public static void main(String[] args) {

        Person alimaa = new Person();
        alimaa.setName("Alimaa");
        alimaa.setAge(18);
        alimaa.setSkinColor(SkinColor.BROWN);
        Person Marcy= new Person();

        System.out.println(alimaa.getName());
        System.out.println(alimaa.getSkinColor());


    }
}
