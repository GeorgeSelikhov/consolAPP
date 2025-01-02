import Input.InputConsol;
import Menu.UserInterface;

public class App {
    public static void main(String[] args){
        InputConsol iC = new InputConsol();
        UserInterface uI = new UserInterface();
        uI.firstMenu();
        iC.inputDigit();
        uI.collectMenu();
        iC.inputDigit();
    }
}
