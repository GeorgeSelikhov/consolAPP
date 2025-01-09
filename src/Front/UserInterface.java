package Front;

import Collect.BookCollect;
import Collect.CarsCollect;
import Collect.RootCollection;
import Front.Button.FirstButton;
import Front.Button.ThirdButton;
import Input.InputConsol;

public class UserInterface {
    Menu m = new Menu();
    InputConsol iC = new InputConsol();
    FirstButton fB = new FirstButton();
    ThirdButton tB = new ThirdButton();

    int token;
    public void goInt(){
        while (true) {
            m.firstMenu();
            token = iC.inputDigit();
            if (token == 1) {
                fB.firstButton();
            } else if (token == 2) {
                m.collectMenu();
            } else if (token == 3) {
                tB.thirdButton();
            } else if (token == 4) {
                break;
            }
        }
    }

}

