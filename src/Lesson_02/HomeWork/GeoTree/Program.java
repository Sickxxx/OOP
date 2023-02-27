package Lesson_02.HomeWork.GeoTree;

import Lesson_02.HomeWork.GeoTree.GeoTree;
import Lesson_02.HomeWork.GeoTree.Person;
import Lesson_02.HomeWork.GeoTree.Relations;
import Lesson_02.HomeWork.GeoTree.Search;

public class Program {
    public static void main(String[] args) {
//        Animal cat1 = new Dog("Барсик", 2);
//        Person pers1 = new Person("Мария", 25, "F");
////        Animal cat2 = new Cat();
////        Animal dog1 = new Dog("Шарик", 5);
////        Animal dog2 = new Dog();
////        System.out.println(cat1.getInfo());
////        System.out.println(cat2.getInfo());
////        System.out.println(dog1.getInfo());
////        System.out.println(dog2.getInfo());
////        cat1.getVoice();
////        dog2.getVoice();
//        pers1.petAnimal(cat1);
        Person ivan = new Person("Иван", 50, "M");
        Person mariya = new Person("Мария", 50, "F");
        Person sergey = new Person("Сергей", 25, "M");
        Person anna = new Person("Анна", 25, "F");
        Person alex = new Person("Алексей");

        GeoTree gt = new GeoTree();
        gt.appendSpouses(ivan, mariya);
        gt.appendChild(ivan, mariya, sergey);
        gt.appendSpouses(sergey, anna);
        gt.appendChild(sergey, anna, alex);
        System.out.println(new Search(gt).find(sergey, Relations.PARENT));
    }
}
