package Lesson_01.HomeWork;

import java.util.Objects;

import static Lesson_01.HomeWork.Main.father;
import static Lesson_01.HomeWork.Main.mother;

public class Relations {
    public void relShow(Person pers1, Person pers2){
        if(Objects.isNull(pers1)|Objects.isNull(pers2)){
            System.out.println("Please, set your character!");
        }
        if (pers1.equals(father)&pers2.equals(mother)){
            father.setStatus("Husband");
            mother.setStatus("Wife");
            System.out.println(pers1 + " and " + pers2 + " is spouses");
            System.out.println(pers1 + " is " + pers1.getStatus());
            System.out.println(pers2 + " is " + pers2.getStatus());
        }else{
            System.out.println("Unknown");
        }
    }
}
