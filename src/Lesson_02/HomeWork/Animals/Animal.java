package Lesson_02.HomeWork.Animals;

import lombok.Setter;


@Setter
public abstract class Animal {
    protected String name;
    protected boolean hungry = true;
    private static int number;

    static {
        number = 0;
    }
    public String getName() {
        return name;
    }
    public Animal(String name, boolean hungry) {
        this.name = name;
        this.hungry = hungry;
    }

    public Animal(String name) {
        this(name, true);
    }

    public Animal() {
        this(String.format("Animal #%d", ++Animal.number), true);
    }
    public boolean isHungry() {
        return this.hungry;
    }

    public String getInfo() {
        return String.format("Name: %s  Hungry: %s Class: %s",
                this.name, this.hungry, this.getClass().getSimpleName());
    }
    @Override
    public String toString() {
        return name;
    }

}

