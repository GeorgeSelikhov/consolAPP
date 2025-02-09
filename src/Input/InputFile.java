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
    private String fileStr = writeFileToString();
    private String writeFileToString(){
        String str;
        try {
            str = fileRead(path);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        return str;
    }

    //создание массива строк
    String[] arrStr = parseFileStrToArray(fileStr);

    //овверрайды интерфейса
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

    //парсинг строк файла в массив
    private String[] parseFileStrToArray(String str){
        String[] parts = str.split("\n");
        for (int i = 0; i < parts.length; i++) {
            parts[i] = delSpcSymb(parts[i]);
        }
        return parts;
    }

//    private String[] parseArrStrToSubArrStr(String[] arrIn, int i){
//        String[] arrOut = new String[3];
//        String str = arrIn[i];
//        int fSpcInd = str.indexOf(" ");
//        int lSpcInd;
//        for (int j = 0; j < arrOut.length; j++) {
//
//        }
//    }

    //чистка строки от лишних символов
    private String delSpcSymb(String str){
        str = str.startsWith("\n") ? str.substring(1) : str;
        return str;
    }
}
