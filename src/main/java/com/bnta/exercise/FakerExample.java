package com.bnta.exercise;

import com.github.javafaker.Faker;

public class FakerExample {
    public static void main(String[] args) {
        Faker faker =new Faker();
        System.out.println(faker.book().title());
        System.out.println(faker.superhero().name());
    }


}
