package Front.Button;

import Collect.BookCollect;
import Collect.CarsCollect;
import Collect.RootCollection;
import Front.Menu;
import Input.InputConsol;

public class FirstButton {
    InputConsol iC = new InputConsol();
    BookCollect bC = new BookCollect();
    CarsCollect cC = new CarsCollect();
    RootCollection rC = new RootCollection();
    Menu m = new Menu();
    int token;

    public void firstButton(){
        while (true) {
            m.collectMenu();
            token = iC.inputDigit();
            if (token == 1) {
                while (true) {
                    m.exitMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        bC.getBookList(iC.inputDigit(), iC.inputString(), iC.inputString());
                    } else if (token == 2) {
                        bC.showBookList();
                    } else if (token == 3) {
                        break;
                    }
                }
            } else if (token == 2) {
                while (true) {
                    m.exitMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        cC.getCarsList(iC.inputDigit(), iC.inputString(), iC.inputString());
                    } else if (token == 2) {
                        cC.showCarsList();
                    } else if (token == 3) {
                        break;
                    }
                }
            } else if (token == 3) {
                while (true) {
                    m.exitMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        rC.getRootList(iC.inputDigit(), iC.inputString(), iC.inputString());
                    } else if (token == 2) {
                        rC.showRootList();
                    } else if (token == 3) {
                        break;
                    }
                }
            } else if (token == 4) {
                break;
            }
        }
    }
}

