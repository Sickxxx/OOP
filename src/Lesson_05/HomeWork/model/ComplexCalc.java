package Lesson_05.HomeWork.model;

import Lesson_05.HomeWork.Logger;

public class ComplexCalc extends SetDigits implements Model<Complex> {

    @Override
    public Complex sum() {
        Logger.logData("сумма комплексных: " + (x + a) + " " + (y + b));
        return new Complex((x + a), (y + b));
    }

    @Override
    public Complex dif() {
        Logger.logData("разность комплексных: " + (x - a) + " " + (y - b));
        return new Complex((x - a), (y - b));
    }

    @Override
    public Complex mult() {
        Logger.logData("Произведение комплексных: " + (x * a - y * b) + " " + (y * a + b * x));
        return new Complex((x * a - y * b), (y * a + b * x));
    }

    @Override
    public Complex div() {
        Logger.logData("Частное комплексных: " + (x * a + y * b) / (a * a + b * b) + " " + (y * a - b * x) / (a * a + b * b));
        return new Complex((x * a + y * b) / (a * a + b * b), (y * a - b * x) / (a * a + b * b));
    }
}
