package Lesson_05.HomeWork.model;

import Lesson_05.HomeWork.Logger;

public class RatioCalc extends SetDigits implements Model<Double> {

    @Override
    public Double sum() {
        Logger.logData("сумма чисел: "+ (x+y));
        return (x+y);
    }

    @Override
    public Double dif() {
        Logger.logData("разность чисел: "+ (x-y));
        return (x-y);
    }

    @Override
    public Double mult() {
        Logger.logData("произведение чисел: "+ (x*y));
        return (x*y);
    }

    @Override
    public Double div() {
        Logger.logData("частное чисел: "+ (x/y));
        return (x/y);
    }
}
