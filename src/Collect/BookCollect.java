package Collect;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Triple;

public class BookCollect {
    List<Triple<Object,Object,Object>> bookList = new ArrayList<>();


    public void getBookList(String str){
        bookList.add(str);
    }

    public void showBokList(){
        System.out.println(bookList);
    }
}
