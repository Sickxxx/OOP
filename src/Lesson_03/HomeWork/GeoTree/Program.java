package Lesson_03.HomeWork.GeoTree;


import java.io.IOException;

public class Program {
    public static void main(String[] args) throws IOException {
        Person person1 = new Person("Иван");
        Person person2= new Person("Мария");
        Person person3 = new Person("Сергей");
        Person person4 = new Person("Анна");
//        Person person5 = new Person("Алексей");

        person1.append(person2, Relations.SPOUSES);
        person1.append(person3, Relations.CHILD);
//        person3.append(person4, Relations.CHILD);
//        person4.append(person5, Relations.CHILD);
        System.out.println(person1.showChild());
        System.out.println(person2.showChild());
        System.out.println(person3.showParents());




    }
}
