package Lesson_03.HomeWork.GeoTree;

public class Nodes {
    public Person pers1;
    public Relations rel;
    public Person pers2;
    public Nodes(Person pers1, Relations rel, Person pers2){
        this.pers1 = pers1;
        this.rel = rel;
        this.pers2 = pers2;
    }

    public Person getPers1() {
        return pers1;
    }

    public Relations getRel() {
        return rel;
    }

    public Person getPers2() {
        return pers2;
    }
    @Override
    public String toString(){
        return String.format("<%s %s %s >", pers1,rel,pers2);
    }
}
