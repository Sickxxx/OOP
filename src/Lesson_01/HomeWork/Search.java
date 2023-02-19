package Lesson_01.HomeWork;

import java.util.ArrayList;

public class Search {
    private ArrayList<Families> tree;

    public Search(GeoTree geoTree) {
        tree = geoTree.getGeoTree();
    }
    public ArrayList<Person> find(Person p, Relations r){
        ArrayList<Person> res = new ArrayList<>();
        for (Families t: tree){
            if(t.getPers1().getFullName() == p.getFullName() && t.getRel() == r){
                res.add(t.getPers2());
            }
        }
        return res;
    }
}
