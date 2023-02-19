package Lesson_01.HomeWork;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Families> geoTree =  new ArrayList<>();

    public ArrayList<Families> getGeoTree() {
        return geoTree;
    }
    public void appendChild(Person parent, Person child){
        geoTree.add(new Families(parent, Relations.PARENT, child));
        geoTree.add(new Families(child, Relations.CHILD, parent));

    }
    public void appendSpouses(Person husband, Person wife){
        geoTree.add(new Families(husband, Relations.SPOUSES, wife));
        geoTree.add(new Families(wife, Relations.SPOUSES, husband));

    }
}
