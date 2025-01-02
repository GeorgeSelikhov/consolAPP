package Front;

import Input.InputConsol;

public class UserInterface {
    Menu m = new Menu();
    InputConsol iC = new InputConsol();
    int token;
    public void goInt(){
        while (true) {
            m.firstMenu();
            token = iC.inputDigit();
            if (token == 1) {
                while (true) {
                    m.collectMenu();
                    token = iC.inputDigit();
                    if (token == 1) {
                        while (true) {
                            //......
                            m.exitMenu();
                            token = iC.inputDigit();
                            if (token == 1) {
                                continue;
                            } else if (token == 2) {
                                //sout ArrayList
                            } else if (token == 3) {
                                break;
                            }
                        }
                    } else if (token == 2) {
                        while (true) {
                            //......
                            m.exitMenu();
                            token = iC.inputDigit();
                            if (token == 1) {
                                continue;
                            } else if (token == 2) {
                                //sout ArrayList
                            } else if (token == 3) {
                                break;
                            }
                        }
                    } else if (token == 3) {
                        while (true) {
                            //......
                            m.exitMenu();
                            token = iC.inputDigit();
                            if (token == 1) {
                                continue;
                            } else if (token == 2) {
                                //sout ArrayList
                            } else if (token == 3) {
                                break;
                            }
                        }
                    } else if (token == 4) {
                        break;
                    }

                }
            } else if (token == 2) {
                m.collectMenu();
            } else if (token == 3) {
                m.collectMenu();
            } else if (token == 4) {
                break;
            }
        }
    }

}

