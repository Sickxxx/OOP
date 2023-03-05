package Lesson_04.HomeWork.Priority;

public class LowPriority extends Priority{
    public LowPriority(Object priority) {
        super(priority);
    }

    public LowPriority() {
    }


    @Override
    public void notice(){
        System.out.println("Сделать в течении недели");
    }
}
