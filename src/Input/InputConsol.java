package Input;

import Validate.Validate;
import java.util.Scanner;

public class InputConsol extends Validate implements Inputer{
    Scanner input = new Scanner(System.in);

    @Override
    public int inputDigit() {
        String str = null;
        System.out.print("Please, enter digit: ");
        while(true){
            str = input.nextLine();
            if(validNum(str)){
                break;
            }else{
                System.out.print("No, please again: ");
            }
        }
        return Integer.parseInt(str);
    }

    @Override
    public String inputWord() {
        String str = null;
        System.out.print("Please, enter word: ");
        while(true){
            str = input.nextLine();
            if(validWord(str)){
                break;
            }else{
                System.out.print("No, please again: ");
            }
        }
        return str;
    }

    @Override
    public String inputString() {
        System.out.print("Please, enter string: ");
        String str= input.nextLine();
        return str;
    }

    @Override
    public double inputDouble(){
        String str = null;
        System.out.print("Please, enter double: ");
        while(true){
            str = input.nextLine();
            if(validNum(str)){
                break;
            }else{
                System.out.print("No, please again: ");
            }
        }
        return Double.parseDouble(str);
    }
}
