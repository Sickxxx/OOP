package Lesson_01.HomeWork;

public class Main {

    public static void main(String[] args) {
        Person ivan = new Person("Иван");
        Person mariya = new Person("Мария");
        Person sergey = new Person("Сергей");
        Person anna = new Person("Анна");
        Person alex = new Person("Алексей");

        GeoTree gt = new GeoTree();
        gt.appendSpouses(ivan, mariya);
        gt.appendChild(ivan, sergey);
        gt.appendChild(mariya, sergey);
        gt.appendSpouses(sergey, anna);
        gt.appendChild(sergey,alex);
        gt.appendChild(anna,alex);
        System.out.println(new Search(gt).find(anna, Relations.SPOUSES));
    }
}
