package Collect;

import java.util.ArrayList;
import java.util.List;

import Input.InputConsol;
import org.apache.commons.lang3.tuple.Triple;

public class RootCollection implements TouchWithCollect {
    List<Triple<Object,Object,Object>> rootList = new ArrayList<>();
    InputConsol iC = new InputConsol();

    @Override
    public void setList(){
        System.out.println("Enter type of root: ");
        String type = iC.inputString();
        System.out.println("Enter mass: ");
        double mass = iC.inputDouble();
        System.out.println("Enter color: ");
        String color = iC.inputWord();
        rootList.add(Triple.of(type, mass, color));
    }

    @Override
    public void getList(){
        for (Triple<Object, Object, Object> triple : rootList) {
            System.out.println("Type: " + triple.getLeft() + "\nMass: " + triple.getMiddle() + "\nColor: " + triple.getRight());
        }
    }
}
