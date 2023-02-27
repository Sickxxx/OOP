package Lesson_02.HomeWork.Animals;

public class Human implements HumanActions {
    public String name;

    public Human(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }

    public void pet(Animal animal) {
        if (!animal.hungry) {
            System.out.println("Питомец " + animal.getName() + " не голодный");
        } else {
            System.out.println(this.name + " кормит " + animal.getName());
            animal.hungry = true;
        }
    }

    @Override
    public void call(Animal animal) {
        System.out.println(this.name + " зовет " + animal.getName());
    }
}
