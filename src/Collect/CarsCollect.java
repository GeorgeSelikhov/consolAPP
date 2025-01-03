package Collect;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Triple;

public class CarsCollect {
    List<Triple<Object,Object,Object>> carsList = new ArrayList<>();


    public void getCarsList(int year, String name, String charact ){
        carsList.add(Triple.of(year, name, charact));
    }

    public void showCarsList(){
        System.out.println(carsList);
    }
}
