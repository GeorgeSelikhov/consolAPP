package Front.Button;

import Collect.BookCollect;
import Collect.CarsCollect;
import Collect.RootCollection;
import Front.Menu;
import Input.InputConsol;

public class ThirdButton {

    InputConsol iC = new InputConsol();
    BookCollect bC = new BookCollect();
    CarsCollect cC = new CarsCollect();
    RootCollection rC = new RootCollection();
    Menu m = new Menu();
    int token;

    public void thirdButton(){
        while (true) {
            m.collectMenu();
            token = iC.inputDigit();
            if (token == 1) {
                while (true) {
                    m.exitMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        //bC.сетит из другого листа
                    } else if (token == 2) {
                        bC.getList();
                    } else if (token == 3) {
                        break;
                    }
                }
            } else if (token == 2) {
                while (true) {
                    m.exitMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        //cC.сетит из другого листа();
                    } else if (token == 2) {
                        cC.getList();
                    } else if (token == 3) {
                        break;
                    }
                }
            } else if (token == 3) {
                while (true) {
                    m.exitMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        //rC.сетит из другого листа
                    } else if (token == 2) {
                        rC.getList();
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
