package Lesson_04.HomeWork.Priority;

public class Priority <T> implements PriotiryNotice{
    T priority;

    public Priority(T priority) {
        this.priority = priority;
    }

    public Priority() {
    }
    @Override
    public void notice(){
        System.out.println("Сделать в такой-то срок");
    }
}
