package com.bnta.exercise.week4_wed.exercise;

import java.util.List;
import java.util.Optional;

public class PersonService {
    private final PersonDAO personDAO;

    public PersonService(PersonDAO personDAO) {

        this.personDAO = personDAO;
    }

    public void savePerson(Person person) {
        if (person.getAge() == null ||
                person.getId() == null ||
                person.getName().length() == 0) {
            throw new IllegalStateException("Person cannot have empty fields");
        }

        boolean exists = doesPersonWithIdExists(person.getId());

        if (exists) {
            throw new IllegalStateException("person with id " + person.getId() + " already exists");
        }

        personDAO.savePerson(person);
    }


    public void deletePerson(int id) {
        boolean exists = doesPersonWithIdExists(id);
        if (!exists) {
            throw new IllegalStateException("person with id " + id + " not found");
        }
        personDAO.deletePerson(id);
    }


    public List<Person> getPeople() {

        return personDAO.getPeople();
    }

    public Optional<Person> getPersonById(int id) {
        return personDAO
                .getPeople()
                .stream()
                .filter(person -> person.getId().equals(id))
                .findFirst();
    }

    private boolean doesPersonWithIdExists(Integer id) {
        return personDAO
                .getPeople()
                .stream()
                .anyMatch(p -> p.getId().equals(id));
    }
}