package Lesson_04.HomeWork.Priority;

public class MiddlePriority extends Priority {
    public MiddlePriority(Object priority) {
        super(priority);
    }

    public MiddlePriority() {
    }


    @Override
    public void notice(){
        System.out.println("Сделать в течении дня");
    }
}
