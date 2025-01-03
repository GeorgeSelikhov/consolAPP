import Collect.BookCollect;

public class App {
    public static void main(String[] args){
        //UserInterface uI = new UserInterface();
        //uI.goInt();
        BookCollect uC = new BookCollect();
        uC.getBookList( "lanba 1974");
        uC.showBokList();
    }
}
