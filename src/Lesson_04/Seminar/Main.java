package Lesson_04.Seminar;

public class Main {
    public static void main(String[] args) {
        SmallHead sh = new SmallHead();
        Body body = new Body();
        Robot<SmallHead> r1 = new Robot(sh, body);
        r1.getHead().Voice();
    }
}
