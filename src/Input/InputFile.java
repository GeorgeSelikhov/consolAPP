package Input;

import Validate.Validate;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class InputFile extends Validate implements Inputer {
    String path = "C:\\Users\\Juras\\IdeaProjects\\consolAPP\\src\\Input\\test.txt";
    //забор информации из файла
    private String fileRead(String path) throws FileNotFoundException {
        StringBuilder strBuild = new StringBuilder();
        File f = new File(path);
        try(FileReader reader = new FileReader(f)) {
            int c;
            while((c=reader.read())!=-1){
                strBuild.append((char)c);
            }
        }catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        return strBuild.toString();
    }
    //запись файла в строку
    private String fStr;
    {
        try {
            fStr = fileRead(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
    //создание массива строк
    String[] arrStr = parseStrToArray(fStr);

    @Override
    public int inputDigit() {
        String str = this.arrStr[0];
        if(!validNum(str)){
            System.out.println("Eror digital");
        }
        return Integer.parseInt(str);
    }

    @Override
    public String inputWord() {
        String str = this.arrStr[1];
        if(!validWord(str)){
            System.out.println("Eror word");
        }
        return str;
    }

    @Override
    public String inputString() {
        String str = this.arrStr[2];
        return str;
    }

    @Override
    public double inputDouble(){
        String str = this.arrStr[0];
        if(!validNum(str)){
            System.out.println("Eror digital");
        }
        return Double.parseDouble(str);
    }

    //парсинг строки в массив
    private String[] parseStrToArray(String str){
        String[] parts = str.split("\r");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = delSpcSymb(parts[i]);
        }
        return parts;
    }

    //чистка строки от лишних символов
    private String delSpcSymb(String str){
        str = str.startsWith("\n") ? str.substring(1) : str;
        return str;
    }
}
