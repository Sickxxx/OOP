package Lesson_04.HomeWork.Priority;

public class HighPriority extends Priority{
    public HighPriority(Object priority) {
        super(priority);
    }

    public HighPriority() {
    }

    @Override
    public void notice(){
        System.out.println("Сделать в течении часа");
    }
}
