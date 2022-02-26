package com.bnta.exercise.week4_wed.exercise;

public class Main {

    public static void main(String[] args) {
        PersonDAO personDAO = new PersonFileDataAccess();

        Person Ben = new Person(3,"ben",23);
        Person Yang = new Person(1,"yang",25);
        Person Ying = new Person(2,"ying",18);
        personDAO.savePerson(Ben);
//        personDAO.savePerson(Yang);
//        personDAO.savePerson(Ying);
        personDAO.deletePerson(3);
//        personDAO.deletePerson(2);
//        personDAO.deletePerson(3);

        System.out.println(personDAO.getPeople());

//        Person luis = new Person(4,"luis",24);
//        personDAO.savePerson(luis);
//        System.out.println(personDAO.getPeople());
//
//        System.out.println(personDAO.getPersonById(1));





    }


}
