package Lesson_02.HomeWork.Animals;

public class Main{
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Dog dog1 = new Dog("Шарик");
        Fish fish1 = new Fish("Немо");
        Human human1 = new Human("Степан");
        human1.call(cat1);
        cat1.move(human1);
        cat1.play(human1);
        human1.pet(cat1);
        cat1.eat();
        human1.call(fish1);
        fish1.move(human1);
        fish1.play(human1);
        human1.pet(fish1);
        fish1.eat();
    }
}
