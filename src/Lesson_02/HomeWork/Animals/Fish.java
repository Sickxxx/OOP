package Lesson_02.HomeWork.Animals;

public class Fish extends Animal implements PetActions{
    public Fish(String name) {
        super(name);
    }
    @Override
    public void play(Human human) {
        if (this.hungry) {
            System.out.println("Сначала покорми " + this.name + " он голодный");
        } else {
            System.out.println(this.name + " молча смотрит " + human.getName());
        }
    }

    @Override
    public void eat() {
        System.out.println(this.name + " собирает корм, теперь с ней можно поиграть");
        this.hungry = false;
    }

    @Override
    public void move(Human human) {
        System.out.println(this.name + " плывет к " + human.getName());
    }

}
