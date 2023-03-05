package Lesson_04.HomeWork;


import Lesson_04.HomeWork.Priority.HighPriority;
import Lesson_04.HomeWork.Priority.LowPriority;
import Lesson_04.HomeWork.Priority.MiddlePriority;
import Lesson_04.HomeWork.ToDo.ToDo;

public class Main {
    public static void main(String[] args) {
        ToDo toDo = new ToDo("Прочитать книгу");
        LowPriority lp = new LowPriority();
        HighPriority hp = new HighPriority();
        MiddlePriority mp = new MiddlePriority();
        Task<LowPriority> task1 = new Task<>(lp,toDo);
        task1.getPriority().notice();
        toDo.showToDo();
        
    }
}
