package com.bnta.exercise.week3_mon.students;

import java.util.Arrays;
import java.util.Objects;

public class Class {
    private String className;
    private int capacity;
    private Student[] students;

    public Class(String className, int capacity) {
        this.className = className;
        this.capacity = capacity;
        this.students = new Student[capacity];
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    @Override
    public String toString() {
        return "Class{" +
                "className='" + className + '\'' +
                ", capacity=" + capacity +
                ", students=" + Arrays.toString(students) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Class aClass = (Class) o;
        return capacity == aClass.capacity && className.equals(aClass.className) && Arrays.equals(students, aClass.students);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(className, capacity);
        result = 31 * result + Arrays.hashCode(students);
        return result;
    }


}
