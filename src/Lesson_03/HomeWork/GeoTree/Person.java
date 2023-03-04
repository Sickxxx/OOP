package Lesson_03.HomeWork.GeoTree;


import java.io.IOException;
import java.util.ArrayList;

public class Person implements GeoTree, Search, Printer {
    protected String name;
//    protected int age;
//    protected String gender;// M = male, F = female

    public Person(String name) {
        this.name = name;
//        this.age = age;
//        this.gender = gender;
    }
//    public Person(String name) {
//        this(name, 0, "none");
//
//    }

    @Override
    public void append(Person person, Relations relations) throws IOException {
        if (relations == Relations.CHILD) {
            getGeoTree().add(new Nodes(this, Relations.PARENT, person));
            getGeoTree().add(new Nodes(person, Relations.CHILD, this));

            if (person.hasSpouses()) {
                getGeoTree().add(new Nodes(person.showSpouses(), Relations.PARENT, person));
                getGeoTree().add(new Nodes(person, Relations.CHILD, person.showSpouses()));

            }
        }
        if (relations == Relations.SPOUSES) {
            getGeoTree().add(new Nodes(this, Relations.SPOUSES, person));
            getGeoTree().add(new Nodes(person, Relations.SPOUSES, this));
        }
        if (relations == Relations.PARENT) {
            getGeoTree().add(new Nodes(this, Relations.CHILD, person));
            getGeoTree().add(new Nodes(person, Relations.PARENT, this));
        }

    }

//    @Override
//    public void relationsCheck(Person person) {
//        for (Nodes nodes : getGeoTree()) {
//            if (person.hasSpouses()) {
//                if (person.hasChild()){
//                    if(!nodes.pers2.hasChild()){
//                        nodes.pers2.append(person.showChild().get(0), Relations.CHILD);
//                    }
//
//                }
//            }
//        }
//    }


    @Override
    public Person showSpouses() throws IOException {
        for (Nodes nodes : getGeoTree()) {
            if (nodes.pers1.equals(this) && nodes.rel.equals(Relations.SPOUSES)) {
                return nodes.pers2;
            }
        }
        return null;
    }

    @Override
    public boolean hasSpouses() {
        for (Nodes nodes : getGeoTree()) {
            if (nodes.pers1.equals(this) && nodes.rel.equals(Relations.SPOUSES)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean hasChild() {
        for (Nodes nodes : getGeoTree()) {
            if (nodes.pers1.equals(this) && nodes.rel.equals(Relations.PARENT)) {
                return true;
            }
        }
        return false;
    }

    public boolean hasParent() {
        for (Nodes nodes : getGeoTree()) {
            if (nodes.pers1.equals(this) && nodes.rel.equals(Relations.CHILD)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public ArrayList<Person> showParents() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Nodes nodes : getGeoTree()) {
            if (nodes.pers1.getName().equals(this.getName()) && nodes.rel.equals(Relations.CHILD)) {
                result.add(nodes.pers2);
            }
        }
        return result;
    }

    @Override
    public ArrayList<Person> showChild() throws IOException {
        ArrayList<Person> result = new ArrayList<>();
        for (Nodes nodes : getGeoTree()) {
            if (nodes.pers1.getName().equals(this.getName()) && nodes.rel.equals(Relations.PARENT)) {
                result.add(nodes.pers2);
            }
        }
        return result;
    }

    @Override
    public void print() {
        for (Nodes nodes : getGeoTree()) {
            if (this.getName().equals(nodes.pers1.getName()) && nodes.rel.equals(Relations.CHILD)) {
                System.out.println(nodes.pers2);
            }
        }
    }

    public String getName() {
        return name;
    }

//    public int getAge() {
//        return age;
//    }
//
//    public String getGender() {
//        return gender;
//    }


    //    public String personInfo() {
//        return String.format("Name: %s  Age: %d  Gender: %s", this.name, this.age, this.gender);
//    }
    public String personInfo() {
        return String.format("Name: %s  Age: %d  Gender: %s", this.name);
    }

    @Override
    public String toString() {
        return name;
    }
}
