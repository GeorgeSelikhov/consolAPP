package Front;

import Input.InputConsol;

public class UserInterface {
    Menu m = new Menu();
    InputConsol iC = new InputConsol();
    public void goInt(){
        m.firstMenu();
        while (true) {
            if (iC.inputDigit() == 1) {
                m.collectMenu();
                while (true) {
                    if (iC.inputDigit() == 1) {
                        //.....
                    } else if (iC.inputDigit() == 2) {
                        //......
                    } else if (iC.inputDigit() == 3) {
                        //.......
                    } else if (iC.inputDigit() == 4) {
                        break;
                    }
                    m.exitMenu();
                    if(iC.inputDigit() == 2){
                        break;
                    }
                }
            } else if (iC.inputDigit() == 2) {
                m.collectMenu();
            } else if (iC.inputDigit() == 3) {
                m.collectMenu();
            } else if (iC.inputDigit() == 4) {

            }
        }
    }


}

