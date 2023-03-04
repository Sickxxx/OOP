package Lesson_03.HomeWork.GeoTree;

import java.io.IOException;
import java.util.ArrayList;

public interface Search {
    ArrayList<Person> showParents() throws IOException;

    boolean hasSpouses() throws IOException;

    boolean hasParent() throws IOException;

    boolean hasChild() throws IOException;

    ArrayList<Person> showChild() throws IOException;
    Person showSpouses() throws IOException;

}
