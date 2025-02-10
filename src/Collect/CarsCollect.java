package Collect;

import java.util.ArrayList;
import java.util.List;

import Input.InputConsol;
import org.apache.commons.lang3.tuple.Triple;

public class CarsCollect {
    List<Triple<Object,Object,Object>> carsList = new ArrayList<>();
    InputConsol iC = new InputConsol();

    public void setList(double muscle, String model, int year){
        carsList.add(Triple.of(muscle, model, year));
    }

    public void getList(){
        for (Triple<Object, Object, Object> triple : carsList) {
            System.out.println("Muscle: " + triple.getLeft() + "\nModel: " + triple.getMiddle() + "\nYear: " + triple.getRight());
        }
    }
}
