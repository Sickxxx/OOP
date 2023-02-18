package Lesson_01.HomeWork;

public class Main {
    static Person father;
    static Person mother;
    static Person son;

    public static void main(String[] args) {
        father = new Person("Homer",45);
        mother = new Person("Marge", 40);
        son = new Person("Bart", 12);
        Relations var = new Relations();
        var.relShow(father,mother);
    }
}
