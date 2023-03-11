package Lesson_05.HomeWork;

import Lesson_05.HomeWork.controller.Controller;
import Lesson_05.HomeWork.model.ComplexCalc;
import Lesson_05.HomeWork.view.View;

public class Main {
    public static void main(String[] args) {
        var complx = new ComplexCalc();
        var view = new View();
        Controller controller = new Controller(complx, view);
        controller.Calculator();
    }
}
