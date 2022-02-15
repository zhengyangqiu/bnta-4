package com.bnta.exercise.week4_wed.exercise;

import java.io.File;
import java.util.List;

public class PersonFileDataAccess implements PersonDAO{
    File file = new File("../IdeaProjects/hello-bnta-4/src/main/java/com/bnta/exercise/week4_wed/exercise/Data.txt");


    @Override
    public void savePerson(Person person) {

    }

    @Override
    public void deletePerson(int id) {

    }

    @Override
    public List<Person> getPeople() {
        return null;
    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
