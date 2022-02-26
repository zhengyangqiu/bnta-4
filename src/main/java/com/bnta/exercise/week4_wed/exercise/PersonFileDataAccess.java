package com.bnta.exercise.week4_wed.exercise;

import org.apache.commons.lang3.StringUtils;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class PersonFileDataAccess implements PersonDAO{
    List<Person> people = new ArrayList<>();

    @Override
    public void savePerson(Person person) {
//        try {
//            File file = new File("src/main/java/com/bnta/exercise/week4_wed/exercise/Data.txt");
//            if (!file.exists()) {
//                file.createNewFile();
//            }
//
//            FileWriter fileWriter = new FileWriter(file, true);
//            PrintWriter printWriter = new PrintWriter(fileWriter);
//            printWriter.println(person.getId() + "," + person.getName() + "," + person.getAge());
//
//            // once you are done writing to the file
//            printWriter.flush();
//            printWriter.close();
//        } catch (Exception e) {
//            throw new IllegalStateException(e);
//        }
        try {
            File file = new File("src/main/java/com/bnta/exercise/week4_wed/exercise/Data.txt");
            if (!file.exists()){
                file.createNewFile();
                System.out.println("create new file");
            }

            FileWriter myWriter = new FileWriter(file,true);//true open the append mode
            PrintWriter printWriter = new PrintWriter(myWriter);
            //use print to get println method
            printWriter.println(person.getId()+","+person.getName()+","+person.getAge());
            myWriter.flush();
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            throw new IllegalStateException(e);
        }

    }

    @Override
    public void deletePerson(int id) {
        try{
        File inputFile = new File("src/main/java/com/bnta/exercise/week4_wed/exercise/Data.txt");
        File tempFile = new File("src/main/java/com/bnta/exercise/week4_wed/exercise/myTempFile.txt");
        BufferedReader reader = new BufferedReader(new FileReader(inputFile));
        BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

        Scanner myReader = new Scanner(inputFile);

        String[] lineToRemove = new String[0];
        while (myReader.hasNextLine()) {
            String[] data = myReader.nextLine().split(",");
            if (Integer.parseInt(data[0]) == id) {
                lineToRemove = data;

            }
        }

        String remove = StringUtils.join(lineToRemove);


        String currentLine;

        while((currentLine = reader.readLine()) != null) {
            // trim newline when comparing with lineToRemove
            String trimmedLine = currentLine.trim();
            if(trimmedLine.equals(lineToRemove)) continue;
            writer.write(currentLine + System.getProperty("line.separator"));
        }
        writer.close();
        reader.close();
        boolean successful = tempFile.renameTo(inputFile);
        }catch (IOException e){
            e.printStackTrace();
        }


    }

    @Override
    public List<Person> getPeople() {
        File file = new File("src/main/java/com/bnta/exercise/week4_wed/exercise/Data.txt");
        if (!file.exists()){
            return List.of();
        }

        try {

            Scanner myReader = new Scanner(file);
            while(myReader.hasNextLine()){
                String[] data = myReader.nextLine().split(",");
                Person person = new Person(Integer.parseInt(data[0]),data[1],Integer.parseInt(data[2]));
                people.add(person);
            }


        } catch (FileNotFoundException e) {
            System.out.println("An error occurred");
            e.printStackTrace();
        }

        return people;

    }

    @Override
    public Person getPersonById(int id) {
        return null;
    }
}
