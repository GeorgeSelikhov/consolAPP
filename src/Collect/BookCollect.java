package Collect;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Triple;

public class BookCollect {
    List<Triple<Object,Object,Object>> bookList = new ArrayList<>();


    public void getBookList(int year, String name, String charact ){
        bookList.add(Triple.of(year, name, charact));
    }

    public void showBookList(){
        System.out.println(bookList);
    }
}
