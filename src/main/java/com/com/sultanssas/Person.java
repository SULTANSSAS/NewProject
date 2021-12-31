package com.com.sultanssas;

import java.util.List;

public class Person {
    private String name;
    private List<List<String>> courses;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", courses=" + courses +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<List<String>> getCourses() {
        return courses;
    }

    public void setCourses(List<List<String>> courses) {
        this.courses = courses;
    }

    public Person(String name, List<List<String>> courses) {
        this.name = name;
        this.courses = courses;
    }
}
