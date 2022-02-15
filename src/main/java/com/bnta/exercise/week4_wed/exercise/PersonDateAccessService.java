package com.bnta.exercise.week4_wed.exercise;

import java.util.ArrayList;
import java.util.List;

public class PersonDateAccessService implements PersonDAO{
    List<Person> allListOfPeople= new ArrayList<Person>();

    public PersonDateAccessService() {
        allListOfPeople.add(new Person(1,"yang",25));
        allListOfPeople.add(new Person(2,"ying",18));
        allListOfPeople.add(new Person(3,"qiu",20));


    }

    @Override
    public void savePerson(Person person) {
        allListOfPeople.add(person);

    }

    @Override
    public void deletePerson(int id) {
        allListOfPeople.remove(getPersonById(id));

    }

    @Override
    public List<Person> getPeople() {
        return allListOfPeople;
    }

    @Override
    public Person getPersonById(int id) {
        for (Person person : allListOfPeople) {
            if (person.getId()==id){
                return person;
            }

        }
        return null;
    }
}
