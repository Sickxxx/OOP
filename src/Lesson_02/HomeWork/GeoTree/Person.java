package Lesson_02.HomeWork.GeoTree;


import Lesson_02.HomeWork.Animals.Animal;

public class Person {
    protected String name;
    protected int age;
    protected String gender;// M = male, F = female

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(String name) {
        this(name, 0, "none");

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }


    public String personInfo() {
        return String.format("Name: %s  Age: %d  Gender: %s", this.name, this.age, this.gender);
    }
    @Override
    public String toString() {
        return name;
    }
}
