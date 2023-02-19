package Lesson_01.HomeWork;

public class Person {

    private String fullName;
    public Person(String fullName) {
        this.fullName = fullName;
    }
    public String getFullName() {
        return fullName;
    }

    @Override
    public String toString() {
        return fullName;
    }
}
