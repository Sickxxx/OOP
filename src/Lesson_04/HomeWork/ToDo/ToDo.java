package Lesson_04.HomeWork.ToDo;

public class ToDo implements ShowToDo{
    String todo;

    public ToDo(String todo) {
        this.todo = todo;
    }

    public ToDo() {todo = "Отдыхать";
    }
    @Override
    public void showToDo() {
        System.out.println("Вам необходимо сделать: "+ this.todo);
    }
}
