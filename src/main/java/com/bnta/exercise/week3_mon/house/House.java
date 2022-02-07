package com.bnta.exercise.week3_mon.house;

import java.util.Arrays;
import java.util.Objects;

public class House {
    private Address address;
    private HouseSize houseSize;
    private int numberOfBedrooms;
    private Person[]people;

    public House(Address address, HouseSize houseSize, int numberOfBedrooms, Person[] people) {
        this.address = address;
        this.houseSize = houseSize;
        this.numberOfBedrooms = numberOfBedrooms;
        this.people = people;

    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public HouseSize getHouseSize() {
        return houseSize;
    }

    public void setHouseSize(HouseSize houseSize) {
        this.houseSize = houseSize;
    }

    public int getNumberOfBedrooms() {
        return numberOfBedrooms;
    }

    public void setNumberOfBedrooms(int numberOfBedrooms) {
        this.numberOfBedrooms = numberOfBedrooms;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return numberOfBedrooms == house.numberOfBedrooms && address.equals(house.address) && houseSize == house.houseSize && Arrays.equals(people, house.people);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(address, houseSize, numberOfBedrooms);
        result = 31 * result + Arrays.hashCode(people);
        return result;
    }

    @Override
    public String toString() {
        return "House{" +
                "address=" + address +
                ", houseSize=" + houseSize +
                ", numberOfBedrooms=" + numberOfBedrooms +
                ", people=" + Arrays.toString(people) +
                '}';
    }
}
