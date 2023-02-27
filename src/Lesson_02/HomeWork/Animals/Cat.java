package Lesson_02.HomeWork.Animals;

public class Cat extends Animal implements PetActions {
    public Cat(String name) {
        super(name);
    }


    @Override
    public void play(Human human) {
        if (this.hungry) {
            System.out.println("Сначала покорми " + this.name + " он голодный");
        } else {
            System.out.println(this.name + " играет " + human.getName());
        }
    }

    @Override
    public void eat() {
        System.out.println(this.name + " кушает, теперь с ним можно поиграть");
        this.hungry = false;
    }

    @Override
    public void move(Human human) {
        System.out.println(this.name + " крадется к " + human.getName());
    }


}
