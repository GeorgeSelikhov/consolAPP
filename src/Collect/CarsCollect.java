package Collect;

import java.util.ArrayList;
import java.util.List;

import Input.InputConsol;
import org.apache.commons.lang3.tuple.Triple;

public class CarsCollect implements TouchWithCollect{
    List<Triple<Object,Object,Object>> carsList = new ArrayList<>();
    InputConsol iC = new InputConsol();

    public void setList(){
        System.out.println("Enter muscle: ");
        double musc = iC.inputDouble();
        System.out.println("Enter model's car: ");
        String model = iC.inputString();
        System.out.println("Enter year: ");
        int year = iC.inputDigit();
        carsList.add(Triple.of(musc, model, year));
    }

    public void getList(){
        for (Triple<Object, Object, Object> triple : carsList) {
            System.out.println("Muscle: " + triple.getLeft() + "\nModel: " + triple.getMiddle() + "\nYear: " + triple.getRight());
        }
    }
}
