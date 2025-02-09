package Collect;

import org.apache.commons.lang3.tuple.Triple;

import java.util.ArrayList;
import java.util.Collections;

public class RNDCollect {
    ArrayList<Triple<Object,Object,Object>> bookList = new ArrayList<>();
    ArrayList<Triple<Object,Object,Object>> carsList = new ArrayList<>();
    ArrayList<Triple<Object,Object,Object>> rootsList = new ArrayList<>();

    private void createCollectRnd(){
        bookList.add(Triple.of(1974, "SomeBook", "Some Character"));
        bookList.add(Triple.of(1975, "SomeBook2", "Some Character2"));
        bookList.add(Triple.of(1976, "SomeBook3", "Some Character3"));
        bookList.add(Triple.of(1977, "SomeBook4", "Some Character4"));
        bookList.add(Triple.of(1978, "SomeBook5", "Some Character5"));
        bookList.add(Triple.of(1979, "SomeBook6", "Some Character6"));
        bookList.add(Triple.of(1980, "SomeBook7", "Some Character7"));

        carsList.add(Triple.of(16.7, "Avto rnd", 1981));
        carsList.add(Triple.of(17.7, "Avto rnd2", 1982));
        carsList.add(Triple.of(18.7, "Avto rnd3", 1983));
        carsList.add(Triple.of(19.7, "Avto rnd4", 1984));
        carsList.add(Triple.of(20.7, "Avto rnd5", 1985));
        carsList.add(Triple.of(21.7, "Avto rnd6", 1986));
        carsList.add(Triple.of(22.7, "Avto rnd7", 1987));
        carsList.add(Triple.of(23.7, "Avto rnd8", 1988));

        rootsList.add(Triple.of("Type", 5.5, "red"));
        rootsList.add(Triple.of("Type2", 5.6, "black"));
        rootsList.add(Triple.of("Type3", 5.7, "pink"));
        rootsList.add(Triple.of("Type4", 5.8, "yellow"));
        rootsList.add(Triple.of("Type5", 5.9, "grey"));
        rootsList.add(Triple.of("Type6", 6.0, "blue"));
        rootsList.add(Triple.of("Type7", 6.1, "orange"));
    }
    public void some(){
        rootsList.get(0);
    }
}
