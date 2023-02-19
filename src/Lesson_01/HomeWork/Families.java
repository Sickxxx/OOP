package Lesson_01.HomeWork;

public class Families {
    private Person pers1;
    private Relations rel;
    private Person pers2;
    public Families(Person pers1, Relations rel, Person pers2){
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
