package Lesson_05.HomeWork.controller;

import Lesson_05.HomeWork.model.RatioCalc;
import Lesson_05.HomeWork.view.View;
import Lesson_05.HomeWork.model.ComplexCalc;

public class Controller {
    View view;
    ComplexCalc complex;

    public Controller(ComplexCalc comp, View v) {
        complex = comp;
        view = v;
    }

    public void Calculator() {
        int act = view.getInpInt("Выбери тип чисел: 1- рациональные, 2 - комплексные");
        switch (act) {
            case 1:
                actRatio();
                break;
            case 2:
                actComplex();
                break;
            default:
                System.out.println(" ");
        }
    }

    public void actComplex() {
        complex.setX(view.getInpDouble("Введите число X "));
        complex.setA(view.getInpDouble("Введите мнимое число A "));
        complex.setY(view.getInpDouble("Введите число Y "));
        complex.setB(view.getInpDouble("Введите мнимое число B "));
        switch (signSelect()) {
            case 1:
                view.printComplex("Сумма: ", complex.sum());
                break;
            case 2:
                view.printComplex("Разность: ", complex.dif());
                break;
            case 3:
                view.printComplex("Произведение: ", complex.mult());
                break;
            case 4:
                view.printComplex("Частное: ", complex.div());
                break;
            default:
                System.out.println(" ");
        }
    }

    public void actRatio() {
        RatioCalc rc = new RatioCalc();
        rc.setX(view.getInpDouble("Введите число X "));
        rc.setY(view.getInpDouble("Введите число Y "));

        switch (signSelect()) {
            case 1:
                view.printRatio("Сумма: ", rc.sum());
                break;
            case 2:
                view.printRatio("Разность: ", rc.dif());
                break;
            case 3:
                view.printRatio("Произведение: ", rc.mult());
                break;
            case 4:
                view.printRatio("Частное: ", rc.div());
                break;
            default:
                System.out.println(" ");
        }
    }

    public int signSelect() {
        int sign = view.getInpInt("Выбери действие: 1 - sum, 2 - diff, 3 - mult, 4 - div");
        return sign;
    }
}
