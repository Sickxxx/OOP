package Lesson_01.Seminar_01;

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
        return "Person{"+
                "fullName='" + fullName+'\''+"}";
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }



}
