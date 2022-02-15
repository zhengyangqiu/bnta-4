package com.bnta.exercise.week4_wed.exercise;

public class Main {

    public static void main(String[] args) {
        PersonDateAccessService personDateAccessService = new PersonDateAccessService();

        System.out.println(personDateAccessService.getPeople());

        Person luis = new Person(4,"luis",24);
        personDateAccessService.savePerson(luis);
        System.out.println(personDateAccessService.getPeople());

        System.out.println(personDateAccessService.getPersonById(1));





    }


}
