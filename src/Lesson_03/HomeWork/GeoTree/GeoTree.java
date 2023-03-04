package Lesson_03.HomeWork.GeoTree;

import java.io.IOException;
import java.util.ArrayList;

public interface GeoTree {
    ArrayList<Nodes> Geotree = new ArrayList<>();

    default ArrayList<Nodes> getGeoTree() {
        return Geotree;
    }

    void append(Person person, Relations relations) throws IOException;
//    void relationsCheck(Person person);

}
