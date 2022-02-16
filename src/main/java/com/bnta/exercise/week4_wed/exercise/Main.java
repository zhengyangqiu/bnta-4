package com.bnta.exercise.week4_wed.exercise;

public class Main {

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDateAccessService();

        System.out.println(personDAO.getPeople());

        Person luis = new Person(4,"luis",24);
        personDAO.savePerson(luis);
        System.out.println(personDAO.getPeople());

        System.out.println(personDAO.getPersonById(1));





    }


}
