package com.map;

public class Person {

    private String name;
    private String place;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public Person(String name, String place) {
        this.name = name;
        this.place = place;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Person(String name, String place, int age) {
        this.name = name;
        this.place = place;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", place='" + place + '\'' +
                ", age=" + age +
                '}';
    }
}
