package Lesson_02.HomeWork.GeoTree;

import java.util.ArrayList;

public class Search {
    private ArrayList<Nodes> tree;

    public Search(GeoTree geoTree) {
        tree = geoTree.getGeoTree();
    }
    public ArrayList<Person> find(Person p, Relations r){
        ArrayList<Person> res = new ArrayList<>();
        for (Nodes t: tree){
            if(t.getPers1().getName() == p.getName() && t.getRel() == r){
                res.add(t.getPers2());
            }
        }
        return res;
    }
}
