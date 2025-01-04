package org.autowiring.usingXML;

public class Identity {
    private String name;
    private int age;

    public Identity() {
    }

    public Identity(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Identity{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
