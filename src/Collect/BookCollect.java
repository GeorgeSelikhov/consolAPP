package Collect;

import java.util.ArrayList;
import java.util.List;

import Input.InputConsol;
import org.apache.commons.lang3.tuple.Triple;

public class BookCollect {
    List<Triple<Object,Object,Object>> bookList = new ArrayList<>();
    InputConsol iC = new InputConsol();

    public void setList(int year, String name, String charact){
        bookList.add(Triple.of(year, name, charact));
    }

    public void getList(){
        for (Triple<Object, Object, Object> triple : bookList) {
            System.out.println("Year: " + triple.getLeft() + "\nName book: " + triple.getMiddle() + "\nCharacter: " + triple.getRight());
        }
    }

}
