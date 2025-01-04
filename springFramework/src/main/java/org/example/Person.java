package org.example;

import java.util.List;

public class Person {
    int personId;
    String personName;
    Address address;
    private final List<String> courses;

    public Person(int personId, String personName, Address address, List<String> courses) {
        this.personId = personId;
        this.personName = personName;
        this.address = address;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "personId=" + personId +
                ", personName='" + personName + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
