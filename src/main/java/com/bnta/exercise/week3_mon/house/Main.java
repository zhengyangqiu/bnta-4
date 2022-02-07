package com.bnta.exercise.week3_mon.house;

import com.bnta.exercise.week2_fri.oop.SkinColor;
import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;
import java.util.Random;

public class Main {


    public static void main(String[] args) {

        Person aaron = new Person("Aaron", 20, SkinColor.BROWN, "British");
        Person wendy = new Person("wendy", 16, SkinColor.BLACK, "Ghana");

        Address address = new Address("10 bnta Street", "bnta", "london");

        House house = new House(address, HouseSize.XL, 7, new Person[]{aaron, wendy});
        System.out.println(house);


        Person wen = new Person("wendy", SkinColor.BLACK);
        System.out.println(wen);

        Person will = new Person();
        will.setName("WILL");
        will.setAge(20);
        will.setSkinColor(SkinColor.WHITE);

        System.out.println(will);
        System.out.println(Person.count);


        String[]foo={};
        String blue = new String("foo");
        Random random= new Random();

        new Person();
        new Person("wendy",16,SkinColor.BLACK,"Ghana");

        new Person("Michael");
        Person alimaa= new Person("Alimaa",15,SkinColor.BROWN,"Bangladesh");
        System.out.println(alimaa.getName());
        System.out.println(alimaa.getAge());
        System.out.println(alimaa.getSkinColor());

        Person marcy= new Person();
        marcy.setName("Marcy");
        marcy.setAge(22);
        marcy.setSkinColor(SkinColor.WHITE);

        System.out.println(alimaa.equals(marcy));
        System.out.println(Arrays.toString(new int[]{1}));


    }






}



