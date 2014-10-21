package com.coderevisited.spring.framework.inception;

public class Person {

    private final String name;
    private final Address address;

    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }

    public String toString() {
        return "[name:" + name + "]," + address;
    }
}
