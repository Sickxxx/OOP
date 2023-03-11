package Lesson_05.HomeWork.model;

import Lesson_05.HomeWork.Logger;
import lombok.Getter;


@Getter
public class SetDigits {
    protected double x;
    protected double y;

    protected double a;

    protected double b;

    public void setX(double x) {
        this.x = x;
        Logger.logData("число y: " + x);
    }

    public void setY(double y) {
        this.y = y;
        Logger.logData("число y: " + y);
    }

    public void setA(double a) {
        this.a = a;
        Logger.logData("мнимая часть x: " + a);
    }

    public void setB(double b) {
        this.b = b;
        Logger.logData("мнимая часть y: " + b);
    }
}
