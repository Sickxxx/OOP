package Lesson_02.HomeWork.GeoTree;

import java.util.ArrayList;

public class GeoTree {
    private ArrayList<Nodes> geoTree = new ArrayList<>();

    public ArrayList<Nodes> getGeoTree() {
        return geoTree;
    }

    public void appendChild(Person parent1, Person parent2, Person child) {
        geoTree.add(new Nodes(parent1, Relations.PARENT, child));
        geoTree.add(new Nodes(child, Relations.CHILD, parent1));
        geoTree.add(new Nodes(parent2, Relations.PARENT, child));
        geoTree.add(new Nodes(child, Relations.CHILD, parent2));
    }

    public void appendSpouses(Person husband, Person wife) {
        geoTree.add(new Nodes(husband, Relations.HUSBAND, wife));
        geoTree.add(new Nodes(wife, Relations.WIFE, husband));
    }

    public void appendBrosAndSis(Person pers1, Person pers2) {
        if (pers1.getGender() == "M" && pers2.getGender() == "M") {
            geoTree.add(new Nodes(pers1, Relations.BROTHER, pers2));
            geoTree.add(new Nodes(pers2, Relations.BROTHER, pers1));
        } else if (pers1.getGender() == "M" && pers2.getGender() == "F") {
            geoTree.add(new Nodes(pers1, Relations.BROTHER, pers2));
            geoTree.add(new Nodes(pers2, Relations.SISTER, pers1));
        } else if (pers1.getGender() == "F" && pers2.getGender() == "M") {
            geoTree.add(new Nodes(pers1, Relations.SISTER, pers2));
            geoTree.add(new Nodes(pers2, Relations.BROTHER, pers1));
        } else {
            geoTree.add(new Nodes(pers1, Relations.SISTER, pers2));
            geoTree.add(new Nodes(pers2, Relations.SISTER, pers1));
        }
    }
}
