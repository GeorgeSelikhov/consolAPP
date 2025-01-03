package Collect;

import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.tuple.Triple;

public class RootCollection {
    List<Triple<Object,Object,Object>> rootList = new ArrayList<>();


    public void getRootList(int year, String name, String charact ){
        rootList.add(Triple.of(year, name, charact));
    }

    public void showRootList(){
        System.out.println(rootList);
    }
}
