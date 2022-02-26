package com.bnta.exercise.week5_mon.Stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Person> people = getPeople();

        //imperative type approach
//        List<Person> females = new ArrayList<>();
//
//        for (Person person : people) {
//            if (person.getGender().equals(Gender.FEMALE)){
//                females.add(person);
//            }
//
//        }
//        females.forEach(System.out::println);


        //declarative approach

        //filter
        List<Person> females = people.stream().filter(person -> person.getGender().equals(Gender.FEMALE)).collect(Collectors.toList());

        females.forEach(System.out::println);
        //sort
        List<Person> sorted = people.stream().sorted(Comparator.comparing(Person::getAge)).collect(Collectors.toList());
        sorted.forEach(System.out::println);


        //all match
        //any match
        //None match
        //Max
        //Min
        //Group


    }

    public static List<Person>getPeople(){
        return List.of(
                new Person("james bond",20,Gender.MALE),
                new Person("Alina Smith",33,Gender.MALE),
                new Person("Zelda Brown",18,Gender.FEMALE),
                new Person("Anna Cook",30,Gender.FEMALE),
                new Person("Jamie Goa",20,Gender.FEMALE)

        );
    }
}
