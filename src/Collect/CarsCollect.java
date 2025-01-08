package Collect;

import java.util.ArrayList;
import java.util.List;

import Input.InputConsol;
import org.apache.commons.lang3.tuple.Triple;

public class CarsCollect implements TouchWithCollect{
    List<Triple<Object,Object,Object>> carsList = new ArrayList<>();
    InputConsol iC = new InputConsol();

    public void setList(){
        double musc = iC.inputDouble();
        String model = iC.inputString();
        int year = iC.inputDigit();
        carsList.add(Triple.of(musc, model, year));
    }

    public void getList(){
        for (Triple<Object, Object, Object> triple : carsList) {
            System.out.println("Muscle: " + triple.getLeft() + "\nModel: " + triple.getMiddle() + "\nYear: " + triple.getRight());
        }
    }
}
