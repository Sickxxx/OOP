package Lesson_04.HomeWork;

import Lesson_04.HomeWork.ToDo.ToDo;

public class Task <T>{
    private T priority;
    private ToDo toDo;

    public Task(T priority, ToDo toDo) {
        this.priority = priority;
        this.toDo = toDo;
    }
    public T getPriority(){return priority;}

    private String getInfo() {
        return String.format("%s; %s", priority, toDo);
    }

    @Override
    public String toString() {
        return getInfo();
    }

    public ToDo getToDo() {return toDo;
    }
}
