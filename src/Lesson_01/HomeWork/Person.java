package Lesson_01.HomeWork;

public class Person {
    private int age;
    private String name;

    private String status;

    public Person(String name, int age){
        this.name = name;
    }
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @Override
    public String toString(){
        return name;
    }
}
