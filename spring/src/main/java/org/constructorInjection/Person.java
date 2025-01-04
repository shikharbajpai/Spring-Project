package org.constructorInjection;

import java.util.List;

public class Person {
    private final int person_id;
    private final String person_name;
    private final Address address;
    private final List<String> courses;

    public Person(int person_id, String person_name, Address address, List<String> courses) {
        this.person_id = person_id;
        this.person_name = person_name;
        this.address = address;
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "person_id=" + person_id +
                ", person_name='" + person_name + '\'' +
                ", address=" + address +
                ", courses=" + courses +
                '}';
    }
}
