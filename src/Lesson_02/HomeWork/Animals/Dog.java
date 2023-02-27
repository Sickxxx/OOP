package Lesson_02.HomeWork.Animals;

public class Dog extends Animal implements PetActions {
    public Dog(String name) {
        super(name);
    }
    @Override
    public void play(Human human) {
        if (this.hungry) {
            System.out.println("Сначала покорми " + this.name + " он голодный");
        } else {
            System.out.println(this.name + " приносит игрушки " + human.getName());
        }
    }

    @Override
    public void eat() {
        System.out.println(this.name + " ест, теперь с ним можно поиграть");
        this.hungry = false;
    }

    @Override
    public void move(Human human) {
        System.out.println(this.name + " бежит к " + human.getName());
    }


}
