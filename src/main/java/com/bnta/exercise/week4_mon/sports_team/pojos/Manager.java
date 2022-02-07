package com.bnta.exercise.week4_mon.sports_team.pojos;

import java.util.Objects;

public class Manager {
    private String name;

    public Manager(String name){
        this.name=name;
    }

    public Manager(){

    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Manager manager = (Manager) o;
        return name.equals(manager.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }


}
