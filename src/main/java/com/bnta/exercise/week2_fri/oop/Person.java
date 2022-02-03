package com.bnta.exercise.week2_fri.oop;

public class Person {
    private String name;
    private int age;
    private SkinColor skinColor;

    public void setName(String name){
        this.name=name;

    }

    public void setAge(int age){
        this.age=age;

    }

    public void setSkinColor(SkinColor skinColor){
        this.skinColor=skinColor;

    }

    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public SkinColor getSkinColor() {
        return skinColor;
    }
    public String toString(){
        return this.name;//return any object in string



    }
}
