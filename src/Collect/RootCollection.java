package Collect;

import java.util.ArrayList;
import java.util.List;

import Input.InputConsol;
import org.apache.commons.lang3.tuple.Triple;

public class RootCollection {
    List<Triple<Object,Object,Object>> rootList = new ArrayList<>();
    InputConsol iC = new InputConsol();

    public void setList(String type, double mass, String color){
        rootList.add(Triple.of(type, mass, color));
    }

    public void getList(){
        for (Triple<Object, Object, Object> triple : rootList) {
            System.out.println("Type: " + triple.getLeft() + "\nMass: " + triple.getMiddle() + "\nColor: " + triple.getRight());
        }
    }
}
