package Lesson_05.HomeWork.model;

import Lesson_05.HomeWork.Logger;

public class Complex extends SetDigits {
    public Complex(double x, double y) {
        this.x = x;
        this.y = y;
        Logger.logData("Комплексное число" + x + "," + y + "i создано");
    }
    @Override
    public String toString(){
        return (x + " " + y + "i");}

}
